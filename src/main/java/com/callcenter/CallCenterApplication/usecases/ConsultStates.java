package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.StateEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ConsultStates {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultStates.class);
    private static final String STATES_URL = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/";

    public List<StateEntity> execute() {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        LOGGER.info("Consultando estados {}", STATES_URL);
        final ResponseEntity<List<StateEntity>> uriResponse = restTemplate.exchange(
                STATES_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<StateEntity>>() {});
        List<StateEntity> states = new ArrayList<>();
        if (uriResponse.getBody() != null) {
            states = uriResponse.getBody();
            states.sort(Comparator.comparing(StateEntity::getName));
            states.sort(moveToFirst("RJ"));
            states.sort(moveToFirst("SP"));
        }
        return states;
    }

    private static Comparator<? super StateEntity> moveToFirst(final String sigla) {
        return (s1, s2) -> sigla.equals(s1.getInitials()) ? -1 : sigla.equals(s2.getInitials()) ? 1 : 0;
    }

}

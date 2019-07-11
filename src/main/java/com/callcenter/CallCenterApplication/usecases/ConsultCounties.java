package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.CountyEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
public class ConsultCounties {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultCounties.class);
    private static final String STATES_URL = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/";

    public List<CountyEntity> execute(final String id) {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        LOGGER.info("Consultando municipios {}{}/municipios", STATES_URL, id);
        final ResponseEntity<List<CountyEntity>> uriResponse = restTemplate.exchange(
                STATES_URL + id + "/municipios",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CountyEntity>>() {
                });
        return uriResponse.getBody();
    }

}

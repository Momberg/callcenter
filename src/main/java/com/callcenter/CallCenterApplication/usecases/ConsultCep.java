package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.CepEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class ConsultCep {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultCep.class);

    private static final String CEP_URL = "https://viacep.com.br/ws/";

    public CepEntity execute(final String cep) {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        LOGGER.info("Consultando municipios {}{}/json", CEP_URL, cep);
        return restTemplate.getForObject(CEP_URL + cep + "/json", CepEntity.class);
    }

}

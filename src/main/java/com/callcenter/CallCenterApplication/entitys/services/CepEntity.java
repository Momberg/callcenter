package com.callcenter.CallCenterApplication.entitys.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CepEntity {

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String street;

    @JsonProperty("complemento")
    private String complement;

    @JsonProperty("bairro")
    private String neighborhood;

    @JsonProperty("localidade")
    private String locality;

    @JsonProperty("uf")
    private String iso;

    @JsonProperty("unidade")
    private String unity;

    @JsonProperty("ibge")
    private String ibge;

    @JsonProperty("gia")
    private String gia;
}

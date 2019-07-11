package com.callcenter.CallCenterApplication.entitys.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MesoRegionEntity {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "nome")
    private String name;

    @JsonProperty(value = "UF")
    private StateEntity stateEntity;

}

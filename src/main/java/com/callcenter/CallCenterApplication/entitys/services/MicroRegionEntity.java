package com.callcenter.CallCenterApplication.entitys.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MicroRegionEntity {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "nome")
    private String name;

    @JsonProperty(value = "mesorregiao")
    private MesoRegionEntity mesoRegionEntity;

}

package com.callcenter.CallCenterApplication.entitys.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CountyEntity {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "nome")
    private String name;

    @JsonProperty(value = "microrregiao")
    private MicroRegionEntity microRegionEntity;

}

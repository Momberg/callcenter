package com.callcenter.CallCenterApplication.entitys.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegionEntity {

    @JsonProperty("id")
    private int id;

    @JsonProperty("sigla")
    private String initials;

    @JsonProperty("nome")
    private String name;

}

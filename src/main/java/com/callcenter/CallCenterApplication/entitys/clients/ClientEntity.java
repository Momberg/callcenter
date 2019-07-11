package com.callcenter.CallCenterApplication.entitys.clients;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class ClientEntity {

    @Id
    private BigDecimal cpf;

    private String name;

    private String street;

    private String neighborhood;

    private String city;

    private String cep;

}

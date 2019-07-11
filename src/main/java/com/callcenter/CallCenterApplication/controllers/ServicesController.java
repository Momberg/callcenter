package com.callcenter.CallCenterApplication.controllers;

import com.callcenter.CallCenterApplication.entitys.services.CepEntity;
import com.callcenter.CallCenterApplication.entitys.services.CountyEntity;
import com.callcenter.CallCenterApplication.entitys.services.StateEntity;
import com.callcenter.CallCenterApplication.usecases.ConsultCep;
import com.callcenter.CallCenterApplication.usecases.ConsultCounties;
import com.callcenter.CallCenterApplication.usecases.ConsultStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicesController {

    @Autowired
    private ConsultCep consultCep;

    @Autowired
    private ConsultCounties consultCounties;

    @Autowired
    private ConsultStates consultStates;

    @RequestMapping("/consultcep")
    public CepEntity consultCep(@Param("cep") final String cep) {
        return consultCep.execute(cep);
    }

    @RequestMapping("/consultcounties")
    public List<CountyEntity> consultCounties(@Param("id") final String id) {
        return consultCounties.execute(id);
    }

    @RequestMapping("/consultstates")
    public List<StateEntity> consultStates() {
        return consultStates.execute();
    }

}

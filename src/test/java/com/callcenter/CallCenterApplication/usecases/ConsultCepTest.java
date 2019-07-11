package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.CepEntity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsultCepTest {

    private static final String CEP = "04105002";

    private ConsultCep consultCep;

    @Before
    public void setUp() {
        consultCep = new ConsultCep();
    }

    @Test
    public void execute() {
        final CepEntity cepEntity = consultCep.execute(CEP);
        assertNotNull(cepEntity);
        assertEquals("Rua Doutor Nicolau de Sousa Queirós", cepEntity.getStreet());
        assertEquals("de 537/538 a 759/760", cepEntity.getComplement());
        assertEquals("Vila Mariana", cepEntity.getNeighborhood());
        assertEquals("São Paulo", cepEntity.getLocality());
        assertEquals("SP", cepEntity.getIso());
        assertEquals("", cepEntity.getUnity());
        assertEquals("3550308", cepEntity.getIbge());
        assertEquals("1004", cepEntity.getGia());
    }


}

package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.StateEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsultStatesTest {

    private ConsultStates consultStates;

    @Before
    public void setUp() {
        consultStates = new ConsultStates();
    }

    @Test
    public void execute() {
        final List<StateEntity> stateEntities = consultStates.execute();
        assertNotNull(stateEntities);
        final StateEntity stateEntity = stateEntities.get(0);
        assertEquals(35, stateEntity.getId());
        assertEquals("SP", stateEntity.getInitials());
        assertEquals("São Paulo", stateEntity.getName());
        assertEquals(3, stateEntity.getRegion().getId());
        assertEquals("SE", stateEntity.getRegion().getInitials());
        assertEquals("Sudeste", stateEntity.getRegion().getName());
    }
}

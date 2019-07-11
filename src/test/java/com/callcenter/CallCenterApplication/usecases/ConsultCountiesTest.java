package com.callcenter.CallCenterApplication.usecases;

import com.callcenter.CallCenterApplication.entitys.services.CountyEntity;
import com.callcenter.CallCenterApplication.entitys.services.StateEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsultCountiesTest {

    private static final String ID = "35";

    private ConsultCounties consultCounties;

    @Before
    public void setUp() {
        consultCounties = new ConsultCounties();
    }

    @Test
    public void execute() {
        final List<CountyEntity> countyEntities = consultCounties.execute(ID);
        assertNotNull(countyEntities);
        final CountyEntity countyEntity = countyEntities.get(0);
        assertEquals(3500105, countyEntity.getId());
        assertEquals("Adamantina", countyEntity.getName());
        assertEquals(35035, countyEntity.getMicroRegionEntity().getId());
        assertEquals("Adamantina", countyEntity.getMicroRegionEntity().getName());
        assertEquals(3508, countyEntity.getMicroRegionEntity().getMesoRegionEntity().getId());
        assertEquals("Presidente Prudente",
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getName());
        assertEquals(35,
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getId());
        assertEquals("SP",
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getInitials());
        assertEquals("São Paulo",
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getName());
        assertEquals(3,
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getRegion().getId());
        assertEquals("SE",
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getRegion().getInitials());
        assertEquals("Sudeste",
                countyEntity.getMicroRegionEntity().getMesoRegionEntity().getStateEntity().getRegion().getName());
    }

}

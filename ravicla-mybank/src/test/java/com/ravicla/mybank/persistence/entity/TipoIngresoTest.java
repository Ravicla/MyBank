package com.ravicla.mybank.persistence.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TipoIngresoTest {
    private TipoIngreso tipoIngreso;

    @Before
    public void setUp() throws Exception {
        tipoIngreso = new TipoIngreso();
    }

    @Test
    public void getIdTipoIngreso() {
        tipoIngreso.setIdTipoIngreso(3);
        assertEquals(3, tipoIngreso.getIdTipoIngreso().intValue());
    }
    @Test
    public void setIdTipoIngreso() {
        tipoIngreso.setIdTipoIngreso(3);
        assertEquals(3, tipoIngreso.getIdTipoIngreso().intValue());
    }
    @Test
    public void getDescripcion() {
        tipoIngreso.setDescripcion("Bingo");
        assertEquals("Bingo", tipoIngreso.getDescripcion());
    }
    @Test
    public void setDescripcion() {
        tipoIngreso.setDescripcion("Bingo");
        assertEquals("Bingo", tipoIngreso.getDescripcion());
    }
}
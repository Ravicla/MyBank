package com.ravicla.mybank.persistence.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AporteTest {
    private Aporte aporte;

    @Before
    public void setUp() throws Exception {
        aporte = new Aporte();
    }

    @Test
    public void getIdAporte() {
        aporte.setIdAporte(1);
        assertEquals(1, aporte.getIdAporte().intValue());
    }

    @Test
    public void setIdAporte() {
        aporte.setIdAporte(1);
        assertEquals(1, aporte.getIdAporte().intValue());
    }

    @Test
    public void getFechaAporte() {
        Date fechaAporte = new Date();
        aporte.setFechaAporte(fechaAporte);
        assertEquals(fechaAporte, aporte.getFechaAporte());
    }

    @Test
    public void setFechaAporte() {
        Date fechaAporte = new Date();
        aporte.setFechaAporte(fechaAporte);
        assertEquals(fechaAporte, aporte.getFechaAporte());
    }

    @Test
    public void getValorAporte() {
        aporte.setValorAporte(100);
        assertEquals(100, aporte.getValorAporte().intValue());
    }

    @Test
    public void setValorAporte() {
        aporte.setValorAporte(100);
        assertEquals(100, aporte.getValorAporte().intValue());
    }

    @Test
    public void getIdUsuario() {
        aporte.setIdUsuario(1);
        assertEquals(1, aporte.getIdUsuario().intValue());
    }

    @Test
    public void setIdUsuario() {
        aporte.setIdUsuario(1);
        assertEquals(1, aporte.getIdUsuario().intValue());
    }
    @Test
    public void getIdTipoIngreso() {
        aporte.setIdTipoIngreso(1);
        assertEquals(1, aporte.getIdTipoIngreso().intValue());
    }

    @Test
    public void setIdTipoIngreso() {
        aporte.setIdTipoIngreso(1);
        assertEquals(1, aporte.getIdTipoIngreso().intValue());
    }
}
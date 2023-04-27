package com.ravicla.mybank.persistence.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class PrestamoTest {
    private Prestamo prestamo;

    @Before
    public void setUp() throws Exception {
        prestamo = new Prestamo();
    }

    @Test
    public void getIdPrestamo() {
        prestamo.setIdPrestamo(1);
        assertEquals(1, prestamo.getIdPrestamo().intValue());
    }
    @Test
    public void setIdPrestamo() {
        prestamo.setIdPrestamo(1);
        assertEquals(1, prestamo.getIdPrestamo().intValue());
    }
    @Test
    public void getFechaPrestamo() {
        Date fechaPrestamo = new Date();
        prestamo.setFechaPrestamo(fechaPrestamo);
        assertEquals(fechaPrestamo, prestamo.getFechaPrestamo());
    }
    @Test
    public void setFechaPrestamo() {
        Date fechaPrestamo = new Date();
        prestamo.setFechaPrestamo(fechaPrestamo);
        assertEquals(fechaPrestamo, prestamo.getFechaPrestamo());
    }
    @Test
    public void getInteres() {
        prestamo.setInteres(5);
        assertEquals(5, prestamo.getInteres().intValue());
    }
    @Test
    public void setInteres() {
        prestamo.setInteres(5);
        assertEquals(5, prestamo.getInteres().intValue());
    }
    @Test
    public void getValorPrestamo() {
        double valorPrestamo = 40.5;
        prestamo.setValoPrestamo(valorPrestamo);
        assertEquals(valorPrestamo, prestamo.getValoPrestamo(), 0.0001);
    }
    @Test
    public void setValorPrestamo() {
        double valorPrestamo = 40.5;
        prestamo.setValoPrestamo(valorPrestamo);
        assertEquals(valorPrestamo, prestamo.getValoPrestamo(), 0.0001);
    }
    @Test
    public void getTiempoPrestamo() {
        prestamo.setTiempoPrestamo(3);
        assertEquals(3, prestamo.getTiempoPrestamo().intValue());
    }
    @Test
    public void setTiempoPrestamo() {
        prestamo.setTiempoPrestamo(3);
        assertEquals(3, prestamo.getTiempoPrestamo().intValue());
    }
    @Test
    public void getIdUsuario() {
        prestamo.setIdUsuario(2);
        assertEquals(2, prestamo.getIdUsuario().intValue());
    }
    @Test
    public void setIdUsuario() {
        prestamo.setIdUsuario(2);
        assertEquals(2, prestamo.getIdUsuario().intValue());
    }
}
package com.ravicla.mybank.persistence.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CuotaTest {
    private Cuota cuota;

    @Before
    public void setUp() throws Exception {
        cuota = new Cuota();
    }

    @Test
    public void getIdCuota() {
        cuota.setIdCuota(1);
        assertEquals(1, cuota.getIdCuota().intValue());
    }
    @Test
    public void setIdCuota() {
        cuota.setIdCuota(1);
        assertEquals(1, cuota.getIdCuota().intValue());
    }
    @Test
    public void getFechaCuota() {
        Date fechaCuota = new  Date();
        cuota.setFechaCuota(fechaCuota);
        assertEquals(fechaCuota, cuota.getFechaCuota());
    }
    @Test
    public void setFechaCuota() {
        Date fechaCuota = new  Date();
        cuota.setFechaCuota(fechaCuota);
        assertEquals(fechaCuota, cuota.getFechaCuota());
    }
    @Test
    public void getValorCapital() {
        double valorCapital = 12.3;
        cuota.setValorCapital(valorCapital);
        assertEquals(valorCapital, cuota.getValorCapital(), 0.0001);
    }
    @Test
    public void setValorCapital() {
        double valorCapital = 12.3;
        cuota.setValorCapital(valorCapital);
        assertEquals(valorCapital, cuota.getValorCapital(), 0.0001);
    }

    @Test
    public void getPagoCapital() {
        boolean pagoCapital = true;
        cuota.setPagoCapital(pagoCapital);
        assertTrue(cuota.getPagoCapital());
    }

    @Test
    public void setPagoCapital() {
        boolean pagoCapital = true;
        cuota.setPagoCapital(pagoCapital);
        assertTrue(cuota.getPagoCapital());
    }

    @Test
    public void getValorInteres() {
        double valorInteres = 22.3;
        cuota.setValorInteres(valorInteres);
        assertEquals(valorInteres, cuota.getValorInteres(), 0.0001);
    }

    @Test
    public void setValorInteres() {
        double valorInteres = 22.3;
        cuota.setValorInteres(valorInteres);
        assertEquals(valorInteres, cuota.getValorInteres(), 0.0001);
    }

    @Test
    public void getPagoInteres() {
        boolean pagoInteres = true;
        cuota.setPagoInteres(pagoInteres);
        assertTrue(cuota.getPagoInteres());
    }

    @Test
    public void setPagoInteres() {
        boolean pagoInteres = true;
        cuota.setPagoInteres(pagoInteres);
        assertTrue(cuota.getPagoInteres());
    }

    @Test
    public void getAbonoCapital() {
        double abonoCapital = 15.6;
        cuota.setAbonoCapital(abonoCapital);
        assertEquals(abonoCapital, cuota.getAbonoCapital(), 0.0001);

    }

    @Test
    public void setAbonoCapital() {
        double abonoCapital = 15.6;
        cuota.setAbonoCapital(abonoCapital);
        assertEquals(abonoCapital, cuota.getAbonoCapital(), 0.0001);
    }

    @Test
    public void getAbonoInteres() {
        double abonoInteres = 12.3;
        cuota.setAbonoInteres(abonoInteres);
        assertEquals(abonoInteres, cuota.getAbonoInteres(), 0.0001);
    }

    @Test
    public void setAbonoInteres() {
        double abonoInteres = 12.3;
        cuota.setAbonoInteres(abonoInteres);
        assertEquals(abonoInteres, cuota.getAbonoInteres(), 0.0001);
    }
    @Test
    public void getIdPrestamo() {
      cuota.setIdPrestamo(1);
      assertEquals(1,cuota.getIdPrestamo().intValue());
    }

    @Test
    public void setIdPrestamo() {
        cuota.setIdPrestamo(1);
        assertEquals(1,cuota.getIdPrestamo().intValue());
    }
}
package com.ravicla.mybank.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ShareTest {
    private Share share;

    @Before
    public void setUp() throws Exception {
        share = new Share();
    }

    @Test
    public void testGetShareId() {
        share.setShareId(1);
        assertEquals(1, share.getShareId());
    }
    @Test
    public void testGetDate() {
        Date date = new Date();
        share.setDate(date);
        assertEquals(date, share.getDate());
    }
    @Test
    public void testGetCapitalValue() {
        share.setCapitalValue(10.2);
        assertEquals(10.2, share.getCapitalValue(), 0.001);
    }
    @Test
    public void isPaidCapital() {
        assertFalse(share.isPaidCapital());

        share.setPaidCapital(true);
        assertTrue(share.isPaidCapital());

        share.setPaidCapital(false);
        assertFalse(share.isPaidCapital());
    }
    @Test
    public void testGetInterestValue() {
        share.setInterestValue(5);
        assertEquals(5, share.getInterestValue(), 0.001);
    }
    @Test
    public void isPaidInterest() {
        assertFalse(share.isPaidInterest()); // Verifica que inicialmente el valor sea false

        share.setPaidInterest(true);
        assertTrue(share.isPaidInterest()); // Verifica que el valor cambió a true

        share.setPaidInterest(false);
        assertFalse(share.isPaidInterest()); // Verifica que el valor cambió de nuevo a false
    }
    @Test
    public void testGetCreditCapital() {
        share.setCreditCapital(30.5);
        assertEquals(30.5, share.getCreditCapital(), 0.001);
    }
    @Test
    public void testGetCreditInterest() {
        share.setCreditInterest(7.5);
        assertEquals(7.5, share.getCreditInterest(), 0.001);
    }
    @Test
    public void testGetLoanId() {
        share.setLoanId(1);
        assertEquals(1, share.getLoanId());
    }
    @Test
    public void testSetShareId() {
        share.setShareId(1);
        assertEquals(1, share.getShareId());
    }
    @Test
    public void testSetDate() {
        Date date = new Date();
        share.setDate(date);
        assertEquals(date, share.getDate());
    }
    @Test
    public void testSetCapitalValue() {
        share.setCapitalValue(10.2);
        assertEquals(10.2, share.getCapitalValue(), 0.001);
    }
    @Test
    public void testSetPaidCapital() {
        assertFalse(share.isPaidCapital());

        share.setPaidCapital(true);
        assertTrue(share.isPaidCapital());

        share.setPaidCapital(false);
        assertFalse(share.isPaidCapital());
    }
    @Test
    public void testSetInterestValue() {
        share.setInterestValue(5);
        assertEquals(5, share.getInterestValue(), 0.001);
    }
    @Test
    public void testSetPaidInterest() {
        assertFalse(share.isPaidInterest()); // Verifica que inicialmente el valor sea false
        share.setPaidInterest(true);
        assertTrue(share.isPaidInterest()); // Verifica que el valor cambió a true

        share.setPaidInterest(false);
        assertFalse(share.isPaidInterest());
    }
    @Test
    public void testSetCreditCapital() {
        share.setCreditCapital(30.5);
        assertEquals(30.5, share.getCreditCapital(), 0.001);
    }
    @Test
    public void tesSetCreditInterest() {
        share.setCreditInterest(7.5);
        assertEquals(7.5, share.getCreditInterest(), 0.001);
    }
    @Test
    public void testSetLoanId() {
        share.setLoanId(1);
        assertEquals(1, share.getLoanId());
    }
}
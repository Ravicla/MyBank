package com.ravicla.mybank.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LoanTest {
    private Loan loan;

    @Before
    public void setUp() {
        loan = new Loan(2, 102.2);
    }
    @Test
    public void testGetLoanId() {
        loan.setLoanId(1);
        assertEquals(1, loan.getLoanId());
    }
    @Test
    public void testGetDate() {
        Date date = new Date();
        loan.setDate(date);
        assertEquals(date, loan.getDate());
    }
    @Test
    public void testSetLoanId() {
        loan.setLoanId(1);
        assertEquals(1, loan.getLoanId());
    }
    @Test
    public void testSetDate() {
        Date date = new Date();
        loan.setDate(date);
        assertEquals(date, loan.getDate());
    }
    @Test
    public void testGetLoanInterest() {
        loan.setLoanInterest(5);
        assertEquals(5, loan.getLoanInterest());
    }
    @Test
    public void testGetAmount() {
        loan.setAmount(50.4);
        assertEquals(50.4, loan.getAmount(), 0.001);
    }

    @Test
    public void testGetTime() {
        loan.setTime(3);
        assertEquals(3, loan.getTime());
    }
    @Test
    public void testSetLoanInterest() {
        loan.setLoanInterest(5);
        assertEquals(5, loan.getLoanInterest());
    }
    @Test
    public void testSetAmount() {
        loan.setAmount(50.4);
        assertEquals(50.4, loan.getAmount(), 0.001);
    }
    @Test
    public void testSetTime() {
        loan.setTime(3);
        assertEquals(3, loan.getTime());
    }

    @Test
    public void testGetUserId() {
        loan.setUserId(1);
        assertEquals(1, loan.getUserId());
    }
    @Test
    public void testGetShares() {
    List<Share> shares = new ArrayList<>();
        shares.add(new Share());
        shares.add(new Share());
        shares.add(new Share());
        loan.setShares(shares);
        assertThat(loan.getShares(), is(shares));
    }

    @Test
    public void testSetUserId() {
        loan.setUserId(1);
        assertEquals(1, loan.getUserId());
    }
    @Test
    public void testSetShares() {
        List<Share> shares = new ArrayList<>();
        shares.add(new Share());
        shares.add(new Share());
        shares.add(new Share());
        loan.setShares(shares);
        assertThat(loan.getShares(), is(shares));

    }
}
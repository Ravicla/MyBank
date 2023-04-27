package com.ravicla.mybank.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DepositTest {
    private Deposit deposit;

    @Before
    public void setUp(){
        deposit = new Deposit(1, 100);
    }
    @Test
    public void testGetDepositId() {
        deposit.setDepositId(1);
        assertEquals(1, deposit.getDepositId());
    }
    @Test
    public void testGetDate() {
        Date date = new Date();
        deposit.setDate(date);
        assertEquals(date, deposit.getDate());
    }
    @Test
    public void testGetAmount() {
        deposit.setAmount(100);
        assertEquals(100, deposit.getAmount());
    }
    @Test
    public void testGetUserId() {
        deposit.setUserId(1);
        assertEquals(1, deposit.getUserId());
    }
    @Test
    public void testGetTypeOfIncomeId() {
        deposit.setTypeOfIncomeId(1);
        assertEquals(1, deposit.getTypeOfIncomeId());
    }
    @Test
    public void testGetTypeOfIncome() {
        // Crea una instancia de TypeOfIncome para comparar con la que se obtiene del objeto Deposit
        TypeOfIncome expectedTypeOfIncome = new TypeOfIncome();
        expectedTypeOfIncome.setTypeOfIncomeId(1);
        expectedTypeOfIncome.setTypeOfIncome ("salary");

        // Crea una instancia de Deposit y configura su TypeOfIncome
        deposit.setTypeOfIncome(expectedTypeOfIncome);

        // Compara el TypeOfIncome esperado con el obtenido del objeto Deposit
        TypeOfIncome resultTypeOfIncome = deposit.getTypeOfIncome();
        assertEquals(expectedTypeOfIncome, resultTypeOfIncome);
    }

    @Test
    public void testSetDepositId() {
    deposit.setDepositId(1);
    assertEquals(1, deposit.getDepositId());
    }

    @Test
    public void testSetDate() {
        Date date = new Date();
        deposit.setDate(date);
        assertEquals(date, deposit.getDate());
    }

    @Test
    public void testTetAmount() {
        deposit.setAmount(100);
        assertEquals(100, deposit.getAmount());
    }

    @Test
    public void testSetUserId() {
        deposit.setUserId(1);
        assertEquals(1, deposit.getUserId());
    }

    @Test
    public void testSetTypeOfIncomeId() {
        deposit.setTypeOfIncomeId(1);
        assertEquals(1, deposit.getTypeOfIncomeId());
    }

    @Test
    public void testSetTypeOfIncome() {
        TypeOfIncome typeOfIncome = new TypeOfIncome();
        deposit.setTypeOfIncome(typeOfIncome);
        assertEquals(typeOfIncome, deposit.getTypeOfIncome());
    }


}
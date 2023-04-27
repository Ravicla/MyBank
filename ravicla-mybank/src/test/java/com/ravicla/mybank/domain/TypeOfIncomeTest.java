package com.ravicla.mybank.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeOfIncomeTest {
    private TypeOfIncome typeOfIncome;

    @Before
    public void setUp() throws Exception {
        typeOfIncome = new TypeOfIncome();
    }

    @Test
    public void testGetTypeOfIncomeId() {
        typeOfIncome.setTypeOfIncomeId(1);
        assertEquals(1, typeOfIncome.getTypeOfIncomeId());
    }
    @Test
    public void testGetTypeOfIncome() {
        typeOfIncome.setTypeOfIncome("Salary");
        assertEquals("Salary", typeOfIncome.getTypeOfIncome());
    }

    @Test
    public void testSetTypeOfIncomeId() {
        typeOfIncome.setTypeOfIncomeId(1);
        assertEquals(1, typeOfIncome.getTypeOfIncomeId());
    }
    @Test
    public void testSetTypeOfIncome() {
        typeOfIncome.setTypeOfIncome("Salary");
        assertEquals("Salary", typeOfIncome.getTypeOfIncome());
    }
}
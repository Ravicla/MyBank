package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.domain.repository.TypeOfIncomeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class TypeOfIncomeServiceTest {
    @Mock
    private TypeOfIncomeRepository typeOfIncomeRepositoryMock;
    private TypeOfIncomeService typeOfIncomeService;

    @Before
    public void setUp() throws Exception {
        typeOfIncomeService = new TypeOfIncomeService();
        typeOfIncomeService.typeOfIncomeRepository = typeOfIncomeRepositoryMock;
    }

    @Test
    public void getAll() {
        List<TypeOfIncome> expectedTypeOfIncomes = new ArrayList<>();
        expectedTypeOfIncomes.add(new TypeOfIncome());
        when(typeOfIncomeRepositoryMock.getAll()).thenReturn(expectedTypeOfIncomes);
        List<TypeOfIncome> actualTypeOfIncomes = typeOfIncomeService.getAll();
        assertEquals(expectedTypeOfIncomes, actualTypeOfIncomes);
    }

    @Test
    public void getTypeOfIncome() {
        TypeOfIncome expectedTypeOfIncome = new TypeOfIncome();
        when(typeOfIncomeRepositoryMock.getTypeOfIncome(anyInt())).thenReturn(Optional.of(expectedTypeOfIncome));
        Optional<TypeOfIncome> actualTypeOfIncome = typeOfIncomeService.getTypeOfIncome(1);
        assertEquals(expectedTypeOfIncome, actualTypeOfIncome.get());
    }

    @Test
    public void save() {
        TypeOfIncome typeOfIncomeToSave = new TypeOfIncome();
        when(typeOfIncomeRepositoryMock.save(typeOfIncomeToSave)).thenReturn(typeOfIncomeToSave);
        TypeOfIncome savedTypeOfIncome = typeOfIncomeService.save(typeOfIncomeToSave);
        assertEquals(typeOfIncomeToSave, savedTypeOfIncome);
    }

    @Test
    public void delete() {
        TypeOfIncome typeOfIncomeToDelete = new TypeOfIncome();
        when(typeOfIncomeRepositoryMock.getTypeOfIncome(anyInt())).thenReturn(Optional.of(typeOfIncomeToDelete));
        boolean deleted = typeOfIncomeService.delete(1);
        assertEquals(true, deleted);
    }
}
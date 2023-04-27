package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.domain.repository.DepositRepository;
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
public class DepositServiceTest {
    @Mock
    private DepositRepository depositRepositoryMock;
    private DepositService depositService;

    @Before
    public void setUp(){
        depositService = new DepositService();
        depositService.depositRepository = depositRepositoryMock;
    }

    @Test
    public void getAll() {
        List<Deposit> expectedDeposits = new ArrayList<>();
        expectedDeposits.add(new Deposit(1,100));
        when(depositRepositoryMock.getAll()).thenReturn(expectedDeposits);

        List<Deposit> actualDeposits = depositService.getAll();

        assertEquals(expectedDeposits, actualDeposits);
    }
    @Test
    public void getDeposit() {
    Deposit expectedDeposit = new Deposit(1, 200);
        when(depositRepositoryMock.getDeposit(anyInt())).thenReturn(Optional.of(expectedDeposit));

        Optional<Deposit> actualDeposit = depositService.getDeposit(1);

        assertEquals(expectedDeposit, actualDeposit.get());
    }
    @Test
    public void getDepositDetails() {
    Deposit expectedDeposit = new Deposit(1, 500);
        when(depositRepositoryMock.getDepositDetails(anyInt())).thenReturn(Optional.of(expectedDeposit));

        Optional<Deposit> actualDeposit = depositService.getDepositDetails(1);

        assertEquals(expectedDeposit, actualDeposit.get());
    }
    @Test
    public void save() {
    Deposit depositToSave = new Deposit(1, 700);
        when(depositRepositoryMock.save(depositToSave)).thenReturn(depositToSave);

        Deposit savedDeposit = depositService.save(depositToSave);

        assertEquals(depositToSave, savedDeposit);
    }
    @Test
    public void delete() {
        Deposit depositToDelete = new Deposit(1, 190);
        when(depositRepositoryMock.getDeposit(anyInt())).thenReturn(Optional.of(depositToDelete));

        boolean deleted = depositService.delete(1);

        assertEquals(true, deleted);
    }
}
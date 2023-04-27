package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.domain.repository.LoanRepository;
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
public class LoanServiceTest {
    @Mock
    private LoanRepository loanRepositoryMock;
    private LoanService loanService;

    @Before
    public void setUp() throws Exception {
        loanService = new LoanService();
        loanService.loanRepository = loanRepositoryMock;
    }

    @Test
    public void getAll() {
        List<Loan> expectedLoans = new ArrayList<>();
        expectedLoans.add(new Loan(1, 100.1));
        when(loanRepositoryMock.getAll()).thenReturn(expectedLoans);
        List<Loan> actualLoans = loanService.getAll();
        assertEquals(expectedLoans, actualLoans);
    }
    @Test
    public void getLoan() {
        Loan expectedLoan = new Loan(2, 202.2);
        when(loanRepositoryMock.getLoan(anyInt())).thenReturn(Optional.of(expectedLoan));
        Optional<Loan> actualLoan = loanService.getLoan(2);
        assertEquals(expectedLoan, actualLoan.get());
    }
    @Test
    public void getLoanDetails() {
        Loan expectedLoan = new Loan(1, 22);
        when(loanRepositoryMock.getLoanDetails(anyInt())).thenReturn(Optional.of(expectedLoan));
        Optional<Loan> actualLoan = loanService.getLoanDetails(1);
        assertEquals(expectedLoan, actualLoan.get());

    }

    @Test
    public void save() {
        Loan loanToSave = new Loan(1, 300.3);
        when(loanRepositoryMock.save(loanToSave)).thenReturn(loanToSave);
        Loan savedLoan = loanService.save(loanToSave);
        assertEquals(loanToSave, savedLoan);
    }

    @Test
    public void delete() {
        Loan loanToDelete = new Loan(1, 222);
        when(loanRepositoryMock.getLoan(anyInt())).thenReturn(Optional.of(loanToDelete));
        boolean deleted = loanService.delete(1);
        assertEquals(true, deleted);
    }
}
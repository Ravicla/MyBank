package com.ravicla.mybank.domain.repository;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.domain.Share;

import java.util.List;
import java.util.Optional;

public interface LoanRepository {
    List<Loan> getAll();
    Optional<Loan> getLoan(int loanId);
    Optional<Loan> getLoanDetails(int userId);
    List<Loan> getLoanUser(int userId);
    Loan save(Loan loand);
    void delete(int loandId);

}

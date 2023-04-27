package com.ravicla.mybank.domain.repository;

import com.ravicla.mybank.domain.Deposit;

import java.util.List;
import java.util.Optional;

public interface DepositRepository {
    List<Deposit>getAll();
    Optional<Deposit>getDeposit(int depositId);
    Optional<Deposit> getDepositDetails(int userId);
    List<Deposit> getDepositUser(int userId);
    Deposit save(Deposit deposit);
    void delete(int depositId);
}

package com.ravicla.mybank.domain.repository;

import com.ravicla.mybank.domain.TypeOfIncome;

import java.util.List;
import java.util.Optional;

public interface TypeOfIncomeRepository {
    List<TypeOfIncome> getAll();
    Optional<TypeOfIncome> getTypeOfIncome(int typeOfIncomeId);
    TypeOfIncome save(TypeOfIncome typeOfIncome);
    void delete(int typeOfIncomeId);
}

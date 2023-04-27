package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.domain.repository.TypeOfIncomeRepository;
import com.ravicla.mybank.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeOfIncomeService {
    private static final Logger log = LoggerFactory.getLogger(TypeOfIncomeService.class);

    @Autowired
    TypeOfIncomeRepository typeOfIncomeRepository;
    @Autowired
    private JsonUtil jsonUtil;

    public List<TypeOfIncome>getAll(){
        List<TypeOfIncome>typeOfIncomesGetAllOut = typeOfIncomeRepository.getAll();
        log.info("OUT: " + jsonUtil.toJson(typeOfIncomesGetAllOut));
        return (List<TypeOfIncome>) typeOfIncomesGetAllOut;
    }

    public Optional<TypeOfIncome>getTypeOfIncome(int typeOfIncomeId){
        Optional<TypeOfIncome> typeOfIncomeIdOut = typeOfIncomeRepository.getTypeOfIncome(typeOfIncomeId);
        log.info("OUT: " + jsonUtil.toJson(typeOfIncomeIdOut));
        return (Optional<TypeOfIncome>) typeOfIncomeIdOut;
    }

    public TypeOfIncome save(TypeOfIncome typeOfIncome){
        TypeOfIncome typeOfIncomeSaveOut = typeOfIncomeRepository.save(typeOfIncome);
        log.info("Out: " + jsonUtil.toJson(typeOfIncomeSaveOut));
        return typeOfIncomeSaveOut;
    }

    public boolean delete(int typeOfIncomeId){
        return getTypeOfIncome(typeOfIncomeId).map(typeOfIncome -> {
            typeOfIncomeRepository.delete(typeOfIncomeId);
            return true;
        }).orElse(false);
    }
}

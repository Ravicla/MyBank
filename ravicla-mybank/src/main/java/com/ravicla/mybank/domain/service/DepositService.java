package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.domain.repository.DepositRepository;
import com.ravicla.mybank.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepositService {
    private static final Logger log = LoggerFactory.getLogger(DepositService.class);


    @Autowired
    DepositRepository depositRepository;

    @Autowired
    private JsonUtil jsonUtil;

    public List<Deposit> getAll(){
        List<Deposit> depositGetAllOut = depositRepository.getAll();
        log.info("OUT: " + jsonUtil.toJson(depositGetAllOut));
        return (List<Deposit>) depositGetAllOut;
    }

    public Optional<Deposit>getDeposit(int depositId){
        Optional<Deposit> depositIdOut = depositRepository.getDeposit(depositId);
        log.info("OUT: " + jsonUtil.toJson(depositIdOut));
        return (Optional<Deposit>) depositIdOut;
    }

    public Optional<Deposit>getDepositDetails(int depositId){
        Optional<Deposit> depositIdDetails = depositRepository.getDepositDetails(depositId);
        log.info("OUT: " + jsonUtil.toJson(depositIdDetails));
        return (Optional<Deposit>) depositIdDetails;
    }

    public Deposit save(Deposit deposit){
        Deposit depositSaveOut = depositRepository.save(deposit);
        log.info("OUT: " + jsonUtil.toJson(depositSaveOut));
        return depositSaveOut;
    }

    public boolean delete(int depositId){
        return getDeposit(depositId).map(deposit -> {
            depositRepository.delete(depositId);
            return true;
        }).orElse(false);
    }
}

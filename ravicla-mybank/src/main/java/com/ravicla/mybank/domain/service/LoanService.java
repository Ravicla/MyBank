package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.domain.repository.LoanRepository;
import com.ravicla.mybank.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private static final Logger log = LoggerFactory.getLogger(LoanService.class);

    @Autowired
    LoanRepository loanRepository;
    @Autowired
    private JsonUtil jsonUtil;

    public List<Loan> getAll(){
        List<Loan> loanGetAllOut = loanRepository.getAll();
        log.info("OUT: " + jsonUtil.toJson(loanGetAllOut));
        return (List<Loan>) loanGetAllOut;
    }

    public Optional<Loan> getLoan(int loanId){
        Optional<Loan> loanIdOut = loanRepository.getLoan(loanId);
        log.info("Out: " + jsonUtil.toJson(loanIdOut));
        return (Optional<Loan>) loanIdOut;
    }

    public Optional<Loan> getLoanDetails(int loanId){
        Optional<Loan>loanIdDetails = loanRepository.getLoanDetails(loanId);
        log.info("OUT: " + jsonUtil.toJson(loanIdDetails));
        return (Optional<Loan>) loanIdDetails;
    }

    public Loan save(Loan loan){
        Loan loanSaveOut = loanRepository.save(loan);
        log.info("OUT: " + jsonUtil.toJson(loanSaveOut));
        return loanSaveOut;
    }

    public boolean delete(int loanId){
        return getLoan(loanId).map(loan -> {
            loanRepository.delete(loanId);
            return true;
        }).orElse(false);
    }




}

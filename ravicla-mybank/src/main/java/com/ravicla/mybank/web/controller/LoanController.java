package com.ravicla.mybank.web.controller;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.domain.service.LoanService;
import com.ravicla.mybank.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {
    private static final Logger log = LoggerFactory.getLogger(LoanController.class);

    @Autowired
    private LoanService loanService;
    @Autowired
    private JsonUtil jsonUtil;

    @GetMapping("/all")
    @ApiOperation("Get all Loans")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Loan>>getAll(){
        return new ResponseEntity<>(loanService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a loan with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Loand not found"),
    })
    public ResponseEntity<Loan> getLoan(@ApiParam(value = "The id of the user", required = true, example = "7") @PathVariable("id") int loanId){
        return loanService.getLoan(loanId)
                .map(loand -> new ResponseEntity<>(loand, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/details/{id}")
    @ApiOperation("Search a loan with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Loand not found"),
    })
    public ResponseEntity<Loan> getLoanDetails(@ApiParam(value = "The id of the user", required = true, example = "1") @PathVariable("id") int loanId){
        return loanService.getLoanDetails(loanId)
                .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<Loan> save (@RequestBody Loan loan){
        log.info("IN: " + jsonUtil.toJson(loan));
        return new ResponseEntity<>(loanService.save(loan), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Loan> upodate (@RequestBody Loan loan){
        log.info("IN: " + jsonUtil.toJson(loan));
        return new ResponseEntity<>(loanService.save(loan), HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int loanId){
        log.info("IN: " + jsonUtil.toJson(loanId));
        if(loanService.delete(loanId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

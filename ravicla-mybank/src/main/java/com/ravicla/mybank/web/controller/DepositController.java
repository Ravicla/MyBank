package com.ravicla.mybank.web.controller;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.domain.service.DepositService;
import com.ravicla.mybank.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@RestController
@RequestMapping("/deposits")
public class DepositController {
    private static final Logger log = LoggerFactory.getLogger(DepositController .class);

    @Autowired
    private DepositService depositService;
    @Autowired
    private JsonUtil jsonUtil;

    @GetMapping("/all")
    @ApiOperation("Get all deposits")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Deposit>>getAll(){
        return new ResponseEntity<>(depositService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a deposit with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Deposit not found"),
    })
    public ResponseEntity<Deposit>getDeposit(@ApiParam(value = "The id of the user", required = true, example = "2") @PathVariable("id") int depositId){
        return depositService.getDeposit(depositId)
                .map(deposit -> new ResponseEntity<>(deposit, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @GetMapping("/details/{id}")
    @ApiOperation("Search a deposit with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Deposit not found"),
    })
    public ResponseEntity<Deposit>getDepositDetails(@ApiParam(value = "The id of the user", required = true, example = "1") @PathVariable("id") int depositId){
        return depositService.getDepositDetails(depositId)
                .map(deposit -> new ResponseEntity<>(deposit, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    @PostMapping("/save")
    public ResponseEntity<Deposit>save(@RequestBody Deposit deposit){
        log.info("IN: " + jsonUtil.toJson(deposit));
        return new ResponseEntity<>(depositService.save(deposit), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Deposit> update (@RequestBody Deposit deposit){
        log.info("IN: " + jsonUtil.toJson(deposit));
        return new ResponseEntity<>(depositService.save(deposit), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int depositId){
        log.info("IN " + jsonUtil.toJson(depositId));
        if(depositService.delete(depositId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

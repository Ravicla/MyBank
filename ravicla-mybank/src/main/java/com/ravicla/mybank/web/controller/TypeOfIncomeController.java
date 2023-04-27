package com.ravicla.mybank.web.controller;

import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.domain.service.TypeOfIncomeService;
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
@RequestMapping("/typeOfIncomes")
public class TypeOfIncomeController {
    private static final Logger log = LoggerFactory.getLogger(TypeOfIncomeController.class);

    @Autowired
    private TypeOfIncomeService typeOfIncomeService;
    @Autowired
    private JsonUtil jsonUtil;

    @GetMapping("/all")
    @ApiOperation("Get all TypeOfIncomes")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<TypeOfIncome>>getAll(){
        return new ResponseEntity<>(typeOfIncomeService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @ApiOperation("Search a typeOfIncome with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "TypeOfIncome not found"),
    })
    public ResponseEntity<TypeOfIncome>getTypeOfIncome(@ApiParam(value = "The id of the user", required = true, example = "2") @PathVariable("id") int typeOfIncomeId){
        return typeOfIncomeService.getTypeOfIncome(typeOfIncomeId)
                .map(typeOfIncome -> new ResponseEntity<>(typeOfIncome, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<TypeOfIncome>save (@RequestBody TypeOfIncome typeOfIncome){
        log.info("IN: " + jsonUtil.toJson(typeOfIncome));
        return new ResponseEntity<>(typeOfIncomeService.save(typeOfIncome), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<TypeOfIncome> update (@RequestBody TypeOfIncome typeOfIncome){
        log.info("IN: " + jsonUtil.toJson(typeOfIncome));
        return new ResponseEntity<>(typeOfIncomeService.save(typeOfIncome), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int typeOfIncomeId){
        log.info("IN: " + jsonUtil.toJson(typeOfIncomeId));
        if (typeOfIncomeService.delete(typeOfIncomeId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }




}

package com.ravicla.mybank.web.controller;

import com.ravicla.mybank.domain.User;
import com.ravicla.mybank.domain.service.UserService;
import com.ravicla.mybank.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.mapstruct.control.MappingControl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private JsonUtil jsonUtil;


    @GetMapping("/all")
    @ApiOperation("Get all Users")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<User>>getAll(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @ApiOperation("Search a user with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "User not found"),
    })
    public ResponseEntity<User> getUser(@ApiParam(value = "The id of the user", required = true, example = "7") @PathVariable("id") int userId){
        return userService.getUser(userId)
                .map(user -> new ResponseEntity<>(user,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/detailsloan/{id}")
    @ApiOperation("Search a user with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "User not found"),
    })
    public ResponseEntity<User>getUserDetailsloan(@ApiParam(value = "The id of the user", required = true, example = "7") @PathVariable("id") int userId){
        return userService.getUserDetailsLoan(userId)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @GetMapping("/detailsdeposit/{id}")
    @ApiOperation("Search a user with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "User not found"),
    })
    public ResponseEntity<User>getUserDetailsdeposit(@ApiParam(value = "The id of the user", required = true, example = "7") @PathVariable("id") int userId){
        Optional<User> variable=userService.getUserDetailsDeposit(userId);
        return variable
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    @PostMapping("/save")
    public ResponseEntity<User> save (@RequestBody User user){
        log.info("IN: "+ jsonUtil.toJson(user));
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> update (@RequestBody User user){
        log.info("IN: "+ jsonUtil.toJson(user));
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int userId){
        log.info("IN: " + jsonUtil.toJson(userId));
        if(userService.delete(userId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

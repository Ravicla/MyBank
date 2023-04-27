package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.User;
import com.ravicla.mybank.domain.repository.UserRepository;
import com.ravicla.mybank.util.JsonUtil;
import com.ravicla.mybank.web.controller.UserController;
import org.mapstruct.control.MappingControl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    private JsonUtil jsonUtil;

    public List<User> getAll(){
        List<User> userGetAllOut = userRepository.getAll();
        log.info("OUT: " + jsonUtil.toJson(userGetAllOut));
        return (List<User>) userGetAllOut;
    }

    public Optional<User> getUser(int userId){
        Optional<User> userIdOut = userRepository.getUser(userId);
        log.info("OUT: " + jsonUtil.toJson(userIdOut));
        return (Optional<User>) userIdOut;
    }

    public Optional<User>getUserDetailsLoan(int userId){
        Optional<User> userIdDetailsLoan = userRepository.getUserDetailsLoan(userId);
        log.info("OUT: " + jsonUtil.toJson(userIdDetailsLoan));
        return (Optional<User>) userIdDetailsLoan;
    }

    public Optional<User>getUserDetailsDeposit(int userId){
        Optional<User>userIdDetailsDeposit = userRepository.getUserDetailsDeposit(userId);
        log.info("OUT: " + jsonUtil.toJson(userIdDetailsDeposit));
        return (Optional<User>) userIdDetailsDeposit;
    }

    public User save(User user){
        User userSaveOut = userRepository.save(user);
        log.info("OUT: "+ jsonUtil.toJson(userSaveOut));
        return userSaveOut;
    }

    public boolean delete(int userId){
        return getUser(userId).map(user -> {
            userRepository.delete(userId);
            return true;
        }).orElse(false);
    }




}

package com.ravicla.mybank.domain.repository;

import com.ravicla.mybank.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User>getAll();
    Optional<User>getUser(int userId);
    Optional<User>getUserDetailsLoan(int userId);
    Optional<User>getUserDetailsDeposit(int userId);
    User save(User user);
    void delete(int userId);

}

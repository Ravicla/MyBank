package com.ravicla.mybank.domain.service;

import com.ravicla.mybank.domain.User;
import com.ravicla.mybank.domain.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.control.MappingControl;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)

public class UserServiceTest {
    @Mock
    private UserRepository userRepositoryMock;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService = new UserService();
        userService.userRepository = userRepositoryMock;
    }

    @Test
    public void getAll() {
        List<User> expecteUsers = new ArrayList<>();
        expecteUsers.add(new User());
        when(userRepositoryMock.getAll()).thenReturn(expecteUsers);
        List<User> actualUsers = userService.getAll();
        assertEquals(expecteUsers, actualUsers);
    }

    @Test
    public void getUser() {
        User expectedUser = new User();
        when(userRepositoryMock.getUser(anyInt())).thenReturn(Optional.of(expectedUser));
        Optional<User> actualUser = userService.getUser(3);
        assertEquals(expectedUser, actualUser.get());
    }

    @Test
    public void getUserDetailsLoan() {
        User expectedUser = new User();
        when(userRepositoryMock.getUserDetailsLoan(anyInt())).thenReturn(Optional.of(expectedUser));
        Optional<User> actualUser = userService.getUserDetailsLoan(3);
        assertEquals(expectedUser, actualUser.get());
    }

    @Test
    public void getUserDetailsDeposit() {
        User expectedUser = new User();
        when(userRepositoryMock.getUserDetailsDeposit(anyInt())).thenReturn(Optional.of(expectedUser));
        Optional<User> actualUser = userService.getUserDetailsDeposit(6);
        assertEquals(expectedUser, actualUser.get());
    }

    @Test
    public void save() {
        User userToSave = new User();
        when(userRepositoryMock.save(userToSave)).thenReturn(userToSave);
        User savedUser = userService.save(userToSave);
        assertEquals(userToSave, savedUser);
    }

    @Test
    public void delete() {
        User userToDelete = new User();
        when(userRepositoryMock.getUser(anyInt())).thenReturn(Optional.of(userToDelete));
        boolean deleted = userService.delete(5);
        assertEquals(true, deleted);
    }
}
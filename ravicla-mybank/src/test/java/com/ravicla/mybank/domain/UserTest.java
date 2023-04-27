package com.ravicla.mybank.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UserTest {
    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void getUserId() {
        user.setUserId(1);
        assertEquals(1, user.getUserId());
    }
    @Test
    public void getDni() {
        user.setDni("1234567890");
        assertEquals("1234567890", user.getDni());
    }
    @Test
    public void getName() {
        user.setName("Thalia");
        assertEquals("Thalia", user.getName());
    }
    @Test
    public void getLastName() {
        user.setLastName("Alcivar");
        assertEquals("Alcivar", user.getLastName());
    }
    @Test
    public void getEmail() {
        user.setEmail("ravicla1993@gmail.com");
        assertEquals("ravicla1993@gmail.com", user.getEmail());
    }
    @Test
    public void getPhoneNumber() {
        user.setPhoneNumber("0939137821");
        assertEquals("0939137821", user.getPhoneNumber());
    }
    @Test
    public void getStatus() {
        user.setStatus("Activo");
        assertEquals("Activo", user.getStatus());
    }
    @Test
    public void getPassword() {
        user.setPassword("1234567890");
        assertEquals("1234567890", user.getPassword());
    }
    @Test
    public void getLoans() {
        List<Loan> loans = new ArrayList<>();
        loans.add(new Loan(2, 202.2));
        user.setLoans(loans);
        assertThat(user.getLoans(), is(equalTo(loans)));
    }
    @Test
    public void getDeposits() {
        List<Deposit> deposits = new ArrayList<>();
        deposits.add(new Deposit(1, 100));
        deposits.add(new Deposit(1, 100));
        user.setDeposits(deposits);
        assertThat(user.getDeposits(), is(equalTo(deposits)));
    }


    @Test
    public void setUserId() {
        user.setUserId(1);
        assertEquals(1, user.getUserId());
    }
    @Test
    public void setDni() {
        user.setDni("1234567890");
        assertEquals("1234567890", user.getDni());
    }
    @Test
    public void setName() {
        user.setName("Thalia");
        assertEquals("Thalia", user.getName());
    }
    @Test
    public void setLastName() {
        user.setLastName("Alcivar");
        assertEquals("Alcivar", user.getLastName());
    }
    @Test
    public void setEmail() {
        user.setEmail("ravicla1993@gmail.com");
        assertEquals("ravicla1993@gmail.com", user.getEmail());
    }
    @Test
    public void setPhoneNumber() {
        user.setPhoneNumber("0939137821");
        assertEquals("0939137821", user.getPhoneNumber());
    }
    @Test
    public void setStatus() {
        user.setStatus("Activo");
        assertEquals("Activo", user.getStatus());
    }
    @Test
    public void setPassword() {
        user.setPassword("1234567890");
        assertEquals("1234567890", user.getPassword());
    }
    @Test
    public void setLoans() {
        List<Loan> loans = new ArrayList<>();
        loans.add(new Loan(2, 100.1));
        user.setLoans(loans);
        assertThat(user.getLoans(), is(equalTo(loans)));
    }
    @Test
    public void setAportes() {
        List<Deposit> deposits = new ArrayList<>();
        deposits.add(new Deposit(1, 100));
        deposits.add(new Deposit(1, 100));
        user.setDeposits(deposits);
        assertThat(user.getDeposits(), is(equalTo(deposits)));
    }
}
package com.ravicla.mybank.domain;

import java.util.Date;
import java.util.List;

public class Deposit {
    private int depositId;
    private Date date;
    private int amount;
    private int userId;
    private int typeOfIncomeId;
    private TypeOfIncome typeOfIncome;

    public Deposit(int depositId, int amount) {
        this.depositId = depositId;
        this.amount = amount;
    }

    public TypeOfIncome getTypeOfIncome() {
        return typeOfIncome;
    }

    public void setTypeOfIncome(TypeOfIncome typeOfIncome) {
        this.typeOfIncome = typeOfIncome;
    }

    public int getDepositId() {
        return depositId;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTypeOfIncomeId() {
        return typeOfIncomeId;
    }

    public void setTypeOfIncomeId(int typeOfIncomeId) {
        this.typeOfIncomeId = typeOfIncomeId;
    }


}

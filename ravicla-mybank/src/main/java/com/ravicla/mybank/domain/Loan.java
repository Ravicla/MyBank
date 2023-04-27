package com.ravicla.mybank.domain;

import java.util.Date;
import java.util.List;

public class Loan {
    private int loanId;
    private Date date;
    private int loanInterest;
    private double amount;
    private int time;
    private int userId;
    private List<Share> shares;

    public Loan(int loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(int loanInterest) {
        this.loanInterest = loanInterest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}

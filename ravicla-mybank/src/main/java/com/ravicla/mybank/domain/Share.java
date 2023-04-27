package com.ravicla.mybank.domain;

import java.util.Date;

public class Share {
    private int shareId;

    private Date date;

    private double capitalValue;

    private boolean paidCapital;

    private double interestValue;

    private boolean paidInterest;

    private double creditCapital;

    private double creditInterest;
    private int loanId;


    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCapitalValue() {
        return capitalValue;
    }

    public void setCapitalValue(double capitalValue) {
        this.capitalValue = capitalValue;
    }

    public boolean isPaidCapital() {
        return paidCapital;
    }

    public void setPaidCapital(boolean paidCapital) {
        this.paidCapital = paidCapital;
    }

    public double getInterestValue() {
        return interestValue;
    }

    public void setInterestValue(double interestValue) {
        this.interestValue = interestValue;
    }

    public boolean isPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(boolean paidInterest) {
        this.paidInterest = paidInterest;
    }

    public double getCreditCapital() {
        return creditCapital;
    }

    public void setCreditCapital(double creditCapital) {
        this.creditCapital = creditCapital;
    }

    public double getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(double creditInterest) {
        this.creditInterest = creditInterest;
    }


}

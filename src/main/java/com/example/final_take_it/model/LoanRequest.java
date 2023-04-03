package com.example.final_take_it.model;

import jakarta.persistence.*;

@Entity
public class LoanRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loanRequestId;
    //    FK
    private Long bankId;
    //    FK
    private Long vendorId;
    @Column(nullable = false)
    private Long loanAmount;

    @Column(nullable = false)
    private double loanInterest;
    @Column(nullable = false)
    private String status;

    public Long getLoanRequestId() {
        return loanRequestId;
    }

    public void setLoanRequestId(Long loanRequestId) {
        this.loanRequestId = loanRequestId;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(double loanInterest) {
        this.loanInterest = loanInterest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

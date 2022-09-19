package com.masai.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Wallet {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer walletid;
  private double balance;
  
// Chandan Mourya Java Developer
 

@OneToMany(cascade = CascadeType.ALL)
 private List<BankAccount> bankaccounts = new ArrayList<BankAccount>();

 @OneToMany(cascade = CascadeType.ALL,mappedBy = "wallet")
 private List<Transaction> transactions = new ArrayList<Transaction>();


 

 @OneToOne(cascade = CascadeType.ALL)
// @JsonIgnore
// @JoinColumn(name = "customer_id",referencedColumnName = "cid")
 private Customer customer;
 


 @OneToMany(cascade = CascadeType.ALL,mappedBy = "wallet")
 private List<BillPayment> billlist = new ArrayList<BillPayment>();
 
 @OneToMany(cascade = CascadeType.ALL,mappedBy = "wallet")
 private List<Beneficiary> benificiaryList = new ArrayList<>();
 

}

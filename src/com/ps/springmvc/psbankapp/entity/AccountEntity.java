package com.ps.springmvc.psbankapp.entity;

import java.util.Date;
import java.sql.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table("account")
public class AccountEntity {
	
	@Id
	@Column("accountNo")
	private Integer accNo;
	
	@Column("accountHolderName")
	private String accHolderName;
	
	@Column("balance")
	private Integer balance;

	@Column("accountType")
	private String accountType;
	
	@Column("dataOfBirth")
	private Date dateOfBirth;
	
	@Column("psCode")
    private String psCode;
    
   public AccountEntity() {
}
    
    
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPsCode() {
		return psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}



}

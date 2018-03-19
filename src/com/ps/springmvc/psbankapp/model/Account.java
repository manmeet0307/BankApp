package com.ps.springmvc.psbankapp.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.ps.springmvc.psbankapp.validations.PSCode;

public class Account {
	
	@NotNull(message = " Account Number cannot be zero")
	private Integer accountNo;
	
	@NotNull(message = " Account Holder Name cannot be null")
	@Size(min=2,max=50,message="Invalid length of account holder name")
	@Pattern(regexp="[A-Za-z(\\s)]+")
	private String accountHolderName;
	
	@NotNull(message = "Account balance cannot be null")
	@Min(value=5000,message="Balance should not less than 5000")
	private Integer balance;
	
	@NotNull(message = " Account Type cannot be null")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message = "Date cannot be null")
	@Past(message="Enter valid date")
	private Date dateOfBirth;
	
	@NotNull(message ="psCode cannot be null")
	//@PSCode
	//through model
	@PSCode(value="PSU",message="Starts with psu")
    private String psCode;
	
	
    public Account() {
		
		this.accountNo = 0;
		this.accountHolderName = "";
		this.balance = 0;
		this.accountType = "";
		this.dateOfBirth = new Date();;
		this.psCode ="";
	
	}

	public Account(Integer accountNo, String accountHolderName, Integer balance, String accountType, Date dateOfBirth,
			String pdCode) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
		this.psCode = pdCode;
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

	public void setPdCode(String psCode) {
		this.psCode = psCode;
	}

	
	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}

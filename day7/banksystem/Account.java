package com.day7.banksystem;

public  class Account {
	 private AccountType type;
	 private long accountNumber;
	 private String ifscCode;
	 
	 public Account(AccountType type, long accountNumber, String ifscCode) {
		this.type = type;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
	 public AccountType getType() {
		 return type;
	 }
	 public void setType(AccountType type) {
		 this.type = type;
	 }
	 public long getAccountNumber() {
		 return accountNumber;
	 }
	 public void setAccountNumber(long accountNumber) {
		 this.accountNumber = accountNumber;
	 }
	 public String getIfscCode() {
		 return ifscCode;
	 }
	 public void setIfscCode(String ifscCode) {
		 this.ifscCode = ifscCode;
	 }
	 
}

enum AccountType{
	SAVING,
	CURRENT
}
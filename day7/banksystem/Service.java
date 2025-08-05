package com.day7.banksystem;
import java.util.List;

import com.day6.bankaccount.BankAccount;

import java.util.ArrayList;
public class Service {
	List<SBI> sbiAccounts = new ArrayList<>();
	List<ICICI> iciciAccounts = new ArrayList<>();
	List<PNB> pnbAccounts = new ArrayList<>();
//	public void displayAllAccounts() {
//		for(BankAccount ba : accounts) {
//			System.out.println(ba);
//		}
//	}
//	public boolean isAccountExist(long accountNumber) {
//		for(BankAccount b : accounts) {
//			if(b.getAccountNumber()==accountNumber) {
//				return true;
//			}
//		}
//		return false;
//	}
//	public void addBankAccount(BankAccount ba) {
//		accounts.add(ba);
//	}
//	public BankAccount getByAccountNumber(long accountNumber) {
//		for(BankAccount ba : accounts) {
//			if(ba.getAccountNumber()==accountNumber) {
//				return ba;
//			}
//		}
//		return null;
//	}
}

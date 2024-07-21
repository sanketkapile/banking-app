package com.sanket.banking.service;

import java.util.List;

import com.sanket.banking.dto.AccountDto;


public interface AccountService {

	//Create New Account
	AccountDto createAccount(AccountDto accountDto);
	
	//Display Account Information
	AccountDto getAccountById(Long id);
	
	//Deposit balance
	AccountDto deposit(Long id, double amount);
	
	//Withdraw balance
	AccountDto withdraw(Long id, double amount);
	
	//Display account details
	List<AccountDto> getAllAccounts();
	
	//Delete Account
	void deleteAccount(Long id);
}

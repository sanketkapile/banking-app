package com.sanket.banking.service;

import com.sanket.banking.dto.AccountDto;


public interface AccountService {

	//Create New Account
	AccountDto createAccount(AccountDto accountDto);
	
	//Display Account Information
	AccountDto getAccountById(Long id);
	
	//Deposit balance
	AccountDto deposit(Long id, double amount);
	
	
}

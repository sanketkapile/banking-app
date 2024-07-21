package com.sanket.banking.service.impl;

import org.springframework.stereotype.Service;

import com.sanket.banking.dto.AccountDto;
import com.sanket.banking.entity.Account;
import com.sanket.banking.mapper.AccountMapper;
import com.sanket.banking.repository.AccountRepository;
import com.sanket.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}

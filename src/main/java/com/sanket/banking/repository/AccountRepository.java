package com.sanket.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}

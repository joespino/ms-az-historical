package com.aforo255.msazhistorical.service;

import java.util.List;

import com.aforo255.msazhistorical.domain.Transaction;

public interface TransactionService {

	List<Transaction> findAll();
}

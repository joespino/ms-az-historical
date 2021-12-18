package com.aforo255.msazhistorical.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aforo255.msazhistorical.domain.Transaction;
import com.aforo255.msazhistorical.repository.TransactionRepository;
import com.aforo255.msazhistorical.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository repository;

	@Override
	public List<Transaction> findAll() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

}

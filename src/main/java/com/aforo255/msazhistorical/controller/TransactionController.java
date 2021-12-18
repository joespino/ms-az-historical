package com.aforo255.msazhistorical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aforo255.msazhistorical.domain.Transaction;
import com.aforo255.msazhistorical.service.TransactionService;

@RestController
@RequestMapping(value = "/api/historical")
public class TransactionController {
	
	@Autowired
	private TransactionService service;

	@GetMapping
	public List<Transaction> getTransaction() {
		return service.findAll();
	}
}

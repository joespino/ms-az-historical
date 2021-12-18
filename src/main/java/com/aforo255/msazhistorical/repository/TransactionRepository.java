package com.aforo255.msazhistorical.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aforo255.msazhistorical.domain.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, ObjectId> {

}

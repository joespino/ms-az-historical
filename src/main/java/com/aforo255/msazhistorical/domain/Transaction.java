package com.aforo255.msazhistorical.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Document(collection = "transaction")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private ObjectId _id;
	private Integer id;
	private double amount ; 
	private String type ; 	
	private Integer accountId ;

}

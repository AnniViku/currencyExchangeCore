
package com.verizon.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.microservices.currencyexchangeservice.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	
	//CurrencyExchange findByToAndFromCurrencyExchange(String to, String from);
	
	CurrencyExchange findByFromAndTo  (String to, String from);
	
}


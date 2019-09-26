package com.yash.micorservices.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yash.micorservices.entities.ExchangeValue;
import com.yash.micorservices.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private ExchangeValueRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to){
		ExchangeValue exchangeValue= repository.findByFromAndTo(from.toUpperCase(), to.toUpperCase());
//		 = new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;		
	}
}

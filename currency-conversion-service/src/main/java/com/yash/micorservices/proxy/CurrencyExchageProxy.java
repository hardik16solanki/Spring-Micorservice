package com.yash.micorservices.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yash.micorservices.entity.CurrencyConversionBean;

@FeignClient(name="currency-exchange-service",url="localhost:8000")
public interface CurrencyExchageProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
}

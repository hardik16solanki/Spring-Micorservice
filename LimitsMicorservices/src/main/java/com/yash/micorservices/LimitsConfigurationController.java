package com.yash.micorservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.micorservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration(){
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
	
}

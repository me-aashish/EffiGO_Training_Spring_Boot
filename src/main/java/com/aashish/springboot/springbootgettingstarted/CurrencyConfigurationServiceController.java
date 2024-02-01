package com.aashish.springboot.springbootgettingstarted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationServiceController {

	@Autowired
	private CurrencyConfigurationService config;

	@RequestMapping("/currency-config")
	public CurrencyConfigurationService retreiveConfig() {

		return config;
	}
}

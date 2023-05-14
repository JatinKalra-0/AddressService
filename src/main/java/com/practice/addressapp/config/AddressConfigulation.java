package com.practice.addressapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfigulation {

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}

}

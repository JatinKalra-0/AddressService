package com.practice.addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.addressapp.entity.Address;
import com.practice.addressapp.repository.AddressRepository;
import com.practice.addressapp.response.AddressResponse;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressrepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public AddressResponse getAddressById(int id) {
		
		Address address = addressrepository.findAddressByEmployeeId(id);
		
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
	}
	
}

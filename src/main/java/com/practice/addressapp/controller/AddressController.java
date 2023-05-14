package com.practice.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.addressapp.response.AddressResponse;
import com.practice.addressapp.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{id}")
	ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") int id) {

		AddressResponse addressResponse = addressService.getAddressById(id);

		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}

}

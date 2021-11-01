package com.voizfonica.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voizfonica.app.model.Customer;
import com.voizfonica.app.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	
	@GetMapping("/get/all")
	public List<Customer> getAll(){
		return this.customerRepo.findAll();
	}

}

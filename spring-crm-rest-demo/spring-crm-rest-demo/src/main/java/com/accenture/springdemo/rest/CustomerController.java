package com.accenture.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.springdemo.entity.Customer;
import com.accenture.springdemo.service.CustomerService;

@RestController
@RequestMapping("/rest")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getcustomer()
	{
		return service.getCustomers();
	}
	
	@GetMapping("/customers/{customerID}")
	public Customer getcustomer(@PathVariable int customerID)
	{
		Customer cum = service.getCustomer(customerID);
		return cum;
	}
	
	@PostMapping("/addcustomers")
	public Customer addcustomer(@RequestBody Customer theCustomer)
	{
		service.saveCustomer(theCustomer);
		//return cum;
		return theCustomer;
	}
	
	@DeleteMapping("/deletecustomer/{customerId}")
	public void deletecus(@PathVariable int customerId)
	{
		service.deleteCustomer(customerId);
	}
	
}

package com.springcloud.CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController 
{
	List<Customer> cus = new ArrayList<Customer>();

	public CustomerController() 
	{
		Customer cus1 = new Customer("suhitha","texas",new Long(10));
		Customer cus2 = new Customer("Sarathi","texas",new Long(80));
		Customer cus3=new Customer("Ashwath","India",new Long(20));
		Customer cus4 = new Customer("sathya","India",new Long(90));
		cus.add(cus1);
		cus.add(cus2);
		cus.add(cus3);
		cus.add(cus4);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllcus()
	{
		return this.cus;
		
	}
	
	@GetMapping("/customers/{customer_id}")
	 public Customer getCustomerDetails(@PathVariable Long customer_id) {
	  return this.cus.stream().filter(customer -> customer.getId().equals(customer_id)).findAny().get();

}
}

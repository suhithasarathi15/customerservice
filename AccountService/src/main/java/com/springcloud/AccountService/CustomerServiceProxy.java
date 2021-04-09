package com.springcloud.AccountService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url="localhost:8000" , name="customer-service")
public interface CustomerServiceProxy 
{
	@GetMapping("/customers")
    public List<Customer> getAllCustomers();
    @GetMapping("/customers/{customer_id}")
    public Customer getCustomerDetails(@PathVariable("customer_id") Long customer_id);


}

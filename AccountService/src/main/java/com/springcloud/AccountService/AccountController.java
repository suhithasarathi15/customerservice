package com.springcloud.AccountService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController 
{
   List<Account> acc1 = new ArrayList<Account>();

   @Autowired
   RestTemplate restTemplate;
   
   @Autowired
   CustomerServiceProxy cup;

   public AccountController() {
	Account a1 =new Account(new Long(10),new Double(12000.90),null);
	Account a2 = new Account(new Long(80),new Double(13000.23),null);
	Account a3 = new Account(new Long(20),new Double(1500.2),null);
	Account a4=new Account(new Long(90),new Double(3500),null);
	acc1.add(a1);
	acc1.add(a2);
	acc1.add(a3);
	acc1.add(a4);
}

@GetMapping("/accounts")
public List<Account> getAllAccounts()
{
	return this.acc1;
	
}
@GetMapping("/accounts/{acc_id}")
public Account getlistofaccount(@PathVariable Long acc_id)
{
	Account account = this.acc1.stream().filter(acc -> acc.getId().equals(acc_id)).findAny().orElse(null);
	  Map<String, Long> params = new HashMap<>();
	     params.put("customer_id", account.getId());
	  /*Customer customer = restTemplate.getForObject("http://localhost:7071/customers/{customer_id}" , Customer.class, params);
	  System.out.println("************** Cust found : "+customer);**/
	 
	     Customer cus = cup.getCustomerDetails(acc_id);
	     account.setCus(cus);
	  return account;
	
}
   
	
}

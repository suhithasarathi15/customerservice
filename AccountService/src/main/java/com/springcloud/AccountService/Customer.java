package com.springcloud.AccountService;

public class Customer 
{
	private String name;
	private String address;
	private Long id;
	
	public Customer() {
		super();
	}

	public Customer(String name, String address, Long id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}

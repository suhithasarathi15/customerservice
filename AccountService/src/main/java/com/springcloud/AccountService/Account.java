package com.springcloud.AccountService;

public class Account
{
	private Long id;
	private Double Balnc;
	private Customer cus;
	
	public Account() {
		super();
	}
	public Account(Long id, Double balnc, Customer cus) {
		super();
		this.id = id;
		Balnc = balnc;
		this.cus = cus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getBalnc() {
		return Balnc;
	}
	public void setBalnc(Double balnc) {
		Balnc = balnc;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	

}

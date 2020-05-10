package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.WalletAccount;
import com.example.demo.service.CustomerServiceImpl;

@SpringBootTest
public class DisplayBalanceApplicationTests {

	@Autowired
	public CustomerServiceImpl service ;
	
	
	
	@Test(expected=NullPointerException.class)
	public void getbalance() {
	
		Integer cusId=5;
		WalletAccount b= service.displayBalance(cusId);
		System.out.println(b);
		Double c=0.0;
	assertEquals(c,b.getAccount_Balance());
	
	}



	public DisplayBalanceApplicationTests() {
		super();
	
	}
	}

package io.fruitmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.fruitmart.client.AuthClient;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private AuthClient authClient;
	
	@GetMapping("/getData")
	public String getaData() {
		System.out.println("***************************");
		authClient.getData();
		System.out.println(".................................");
		return "Order Data Access";
	}
}

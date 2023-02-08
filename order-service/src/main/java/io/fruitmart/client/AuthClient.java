package io.fruitmart.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.fruitmart.config.FeignConfigration;

@FeignClient(name = "auth-service" , configuration = FeignConfigration.class)
public interface AuthClient {
	
	@GetMapping("/auth/auth/user")
	public String getData();
}

package com.devsuperior.hroauth.feigclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsuperior.hroauth.entities.User;

@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);

}

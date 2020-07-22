package com.spring.cloud.configserverclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("${role.name}")
	private String role;
	
	@GetMapping("/whoami/{username}")
	public String whoAmI(@PathVariable("username") String username) {
		
		return String.format("Hello! You are %s and you will become a %s ...\n", username, role);
	}

}

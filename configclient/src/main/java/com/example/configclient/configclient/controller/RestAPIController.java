package com.example.configclient.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@org.springframework.web.bind.annotation.RestController
public class RestAPIController {
	@Value("${role.name:Config server issue}")
	private String roleName;

	@GetMapping("/check-role-name")
	public String getMyRole() {
		return this.roleName;
	}
}

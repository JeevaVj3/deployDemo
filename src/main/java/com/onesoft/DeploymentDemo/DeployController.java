package com.onesoft.DeploymentDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
	
	@GetMapping("deploy")
	public String get() {
		return "Success";
	}

}

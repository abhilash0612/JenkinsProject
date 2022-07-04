/**
 * 
 */
package com.abhilash.jenkins.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author abhilashgupta
 *
 */
@RestController
public class Controller {
	
	
	@GetMapping("/sayHello")
	
	public String sayHello() {
		
		return "Hello, Welcome to EazyBank Kubernetes cluster from  : ";
	}

}

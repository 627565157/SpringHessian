package com.chensi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IHelloWorldService;

@RestController
public class TestController {
	@Autowired
	private IHelloWorldService helloWorldSerivce;

	@RequestMapping("/test")
	public String test() {
		return helloWorldSerivce.sayHello("Spring Hessian.");
	}
}

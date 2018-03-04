package com.chensi.demo;

import org.springframework.stereotype.Service;

import com.example.IHelloWorldService;

@Service("helloWorldService")
public class HelloWorldServiceImpl implements IHelloWorldService {

	@Override
	public String sayHello(String name) {
		return "Hello world! " + name;
	}

}

package com.chensi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.example.IHelloWorldService;

@SpringBootApplication
public class HessianClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HessianClientApplication.class, args);
	}

	@Bean
	public HessianProxyFactoryBean helloClient() {
		HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
		factory.setServiceUrl("http://localhost:8090/HelloWorldService");
		factory.setServiceInterface(IHelloWorldService.class);
		return factory;
	}
}

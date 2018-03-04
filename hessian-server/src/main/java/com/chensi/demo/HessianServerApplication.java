package com.chensi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.example.IHelloWorldService;

@SpringBootApplication
public class HessianServerApplication {
	@Autowired
	private IHelloWorldService helloWorldService;

	public static void main(String[] args) {
		SpringApplication.run(HessianServerApplication.class, args);
	}

	@Bean(name = "/HelloWorldService")
	public HessianServiceExporter accountService() {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(helloWorldService);
		exporter.setServiceInterface(IHelloWorldService.class);
		return exporter;
	}
}

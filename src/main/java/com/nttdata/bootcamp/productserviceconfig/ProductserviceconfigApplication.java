package com.nttdata.bootcamp.productserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProductserviceconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceconfigApplication.class, args);
	}

}

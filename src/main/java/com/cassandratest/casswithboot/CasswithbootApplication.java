package com.cassandratest.casswithboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cassandratest")
public class CasswithbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasswithbootApplication.class, args);
	}
}

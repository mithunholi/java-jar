package com.eoxys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.eoxys")
public class DevopsjarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsjarApplication.class, args);
	}
}

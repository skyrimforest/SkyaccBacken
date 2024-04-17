package com.skyrim.skyacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = ("com.skyrim.skyacc"))
public class SkyaccApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyaccApplication.class, args);
	}

}


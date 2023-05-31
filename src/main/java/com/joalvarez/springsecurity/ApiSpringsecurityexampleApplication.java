package com.joalvarez.springsecurity;

import com.joalvarez.baseframework.config.GlobalConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = GlobalConfig.BASE_PACKAGE)
public class ApiSpringsecurityexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringsecurityexampleApplication.class, args);
	}

}
package com.alkemy.icons.icons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class IconsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IconsApplication.class, args);
	}

}

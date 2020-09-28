package com.wcs.checkpoint2.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication()
public class PortfolioApplication {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {

		SpringApplication.run(PortfolioApplication.class, args);


	/*	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "wcs2020*";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);

		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);

		password = "wcs2020";
		isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "           isPasswordMatch    : " + isPasswordMatch);*/

	}

}
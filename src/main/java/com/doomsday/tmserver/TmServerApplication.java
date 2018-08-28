package com.doomsday.tmserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.doomsday.tmserver"})
public class TmServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmServerApplication.class, args);
	}
}

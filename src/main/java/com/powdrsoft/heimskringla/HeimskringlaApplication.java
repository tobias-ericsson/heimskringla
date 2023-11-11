package com.powdrsoft.heimskringla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeimskringlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeimskringlaApplication.class, args);
		System.out.println("Heimskringla!");
	}

}

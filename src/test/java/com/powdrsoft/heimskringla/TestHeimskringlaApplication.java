package com.powdrsoft.heimskringla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHeimskringlaApplication {

	public static void main(String[] args) {
		SpringApplication.from(HeimskringlaApplication::main).with(TestHeimskringlaApplication.class).run(args);
	}

}

package com.dravid.multimodulewebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dravid")
public class MultimodulewebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultimodulewebserviceApplication.class, args);
	}

}

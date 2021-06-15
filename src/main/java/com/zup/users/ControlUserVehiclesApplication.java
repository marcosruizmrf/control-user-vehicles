package com.zup.users;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ControlUserVehiclesApplication implements CommandLineRunner {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ControlUserVehiclesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception, ParseException {
		
	
	
		
	}

}

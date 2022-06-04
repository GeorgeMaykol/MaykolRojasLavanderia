package com.idat.MaykolRojasLavanderia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MaykolRojasLavanderiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaykolRojasLavanderiaApplication.class, args);
	}

}

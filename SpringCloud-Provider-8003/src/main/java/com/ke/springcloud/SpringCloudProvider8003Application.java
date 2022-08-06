package com.ke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author stephen 2022/8/4 20:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProvider8003Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvider8003Application.class, args);
	}
}

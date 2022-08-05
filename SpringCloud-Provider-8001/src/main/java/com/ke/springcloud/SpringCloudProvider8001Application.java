package com.ke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author stephen 2022/8/4 20:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProvider8001Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvider8001Application.class, args);
	}
}

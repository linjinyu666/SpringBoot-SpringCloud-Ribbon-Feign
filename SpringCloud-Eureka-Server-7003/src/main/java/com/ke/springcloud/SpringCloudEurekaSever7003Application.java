package com.ke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author stephen 2022/8/6 14:56
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringCloudEurekaSever7003Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaSever7003Application.class, args);
	}
}

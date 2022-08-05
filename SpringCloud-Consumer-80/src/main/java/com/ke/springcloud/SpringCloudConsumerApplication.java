package com.ke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.swing.*;

/**
 * @author stephen 2022/8/5 21:51
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}

}

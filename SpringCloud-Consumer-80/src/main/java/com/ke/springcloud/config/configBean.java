package com.ke.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author stephen 2022/8/5 21:54
 */
@Configuration
public class configBean {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

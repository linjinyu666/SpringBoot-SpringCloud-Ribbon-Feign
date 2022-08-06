package com.ke.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author stephen 2022/8/5 21:54
 */
@Configuration
public class configBean {
	// 配置负载均衡
	
	@Bean
	@LoadBalanced // Ribbon
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

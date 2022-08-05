package com.ke.springcloud.controller;

import com.ke.springcloud.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author stephen 2022/8/5 21:23
 */
@RestController
public class DeptConsumerController {
	private static final String PREFIX = "http://localhost:8001";
	private final RestTemplate restTemplate;

	@Autowired
	public DeptConsumerController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable Long id) {
		return restTemplate.getForObject(PREFIX + "/dept/get/" + id, Dept.class);
	}

	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return Boolean.TRUE.equals(restTemplate.postForObject(PREFIX + "/dept/add/", dept, boolean.class));
	}

	@RequestMapping("/consumer/dept/list")
	public List getList() {
		return restTemplate.getForObject(PREFIX + "/dept/list", List.class);
	}
}
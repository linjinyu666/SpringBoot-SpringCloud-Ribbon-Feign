package com.ke.springcloud.controller;

import com.ke.springcloud.domain.Dept;
import com.ke.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author stephen 2022/8/4 21:45
 */
@RestController
public class DeptController {
	private final DeptService deptService;
	private final DiscoveryClient client;

	@Autowired
	public DeptController(DeptService deptService, DiscoveryClient client) {
		this.deptService = deptService;
		this.client      = client;
	}

	@PostMapping("/dept/add")
	public boolean addDept(Dept Dept) {
		return deptService.addDept(Dept);
	}

	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.queryByID(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> queryAll() {
		return deptService.queryAll();
	}

	@GetMapping("dept/discovery")
	public Object discovery() {
		List<String> services = client.getServices();
		System.out.println("discovery=>services" + services);
		List<ServiceInstance> instances = client.getInstances("dept-8001");

		for (ServiceInstance instance : instances) {
			System.out.println(instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri() + "\t" + instance.getInstanceId());
		}
		return this.client;
	}
}

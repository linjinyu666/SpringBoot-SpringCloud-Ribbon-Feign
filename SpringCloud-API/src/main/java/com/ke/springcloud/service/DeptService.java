package com.ke.springcloud.service;

import com.ke.springcloud.domain.Dept;

import java.util.List;

/**
 * @author stephen 2022/8/4 21:38
 */
public interface DeptService {
	boolean addDept(Dept Dept);

	Dept queryByID(Long id);

	List<Dept> queryAll();
}

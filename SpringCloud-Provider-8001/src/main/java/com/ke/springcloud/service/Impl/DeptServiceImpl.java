package com.ke.springcloud.service.Impl;

import com.ke.springcloud.domain.Dept;
import com.ke.springcloud.mapper.DeptMapper;
import com.ke.springcloud.service.DeptService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

;

/**
 * @author stephen 2022/8/4 21:35
 */
@Service
public class DeptServiceImpl implements DeptService {
	private final DeptMapper deptMapper;

	@Autowired
	public DeptServiceImpl(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}

	@Override
	public boolean addDept(Dept Dept) {
		return deptMapper.addDept(Dept);
	}

	@Override
	public Dept queryByID(Long id) {
		return deptMapper.queryByID(id);
	}

	@Override
	public List<Dept> queryAll() {
		return deptMapper.queryAll();
	}
}

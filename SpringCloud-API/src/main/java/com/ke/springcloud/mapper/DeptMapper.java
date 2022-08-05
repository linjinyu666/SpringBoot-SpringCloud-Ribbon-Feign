package com.ke.springcloud.mapper;

import com.ke.springcloud.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author stephen 2022/8/4 21:17
 */
@Mapper
public interface DeptMapper {
	boolean addDept(Dept Dept);

	Dept queryByID(Long id);

	List<Dept> queryAll();
}

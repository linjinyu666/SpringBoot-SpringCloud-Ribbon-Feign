package com.ke.springcloud.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author stephen 2022/8/4 20:32
 */
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
	private Long dpId;
	private String dpName;
	private String dbSource;
}

package com.tong.service;

import java.util.List;
import java.util.Map;

import com.tong.entity.Product;


/**
 * 产品Service接口
 *
 */
public interface ProductService {

	/**
	 * 查询产品集合
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String,Object> map);
}

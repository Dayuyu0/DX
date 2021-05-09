package com.tong.dao;

import java.util.List;
import java.util.Map;

import com.tong.entity.Product;


/**
 * 产品Dao接口
 *
 */
public interface ProductDao {

	
	/**
	 * 查询产品集合
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String,Object> map);

}

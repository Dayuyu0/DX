package com.tong.service;

import java.util.List;
import java.util.Map;

import com.tong.entity.Product;


/**
 * ��ƷService�ӿ�
 *
 */
public interface ProductService {

	/**
	 * ��ѯ��Ʒ����
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 */
	public Long getTotal(Map<String,Object> map);
}

package com.tong.dao;

import java.util.List;
import java.util.Map;

import com.tong.entity.Product;


/**
 * ��ƷDao�ӿ�
 *
 */
public interface ProductDao {

	
	/**
	 * ��ѯ��Ʒ����
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 */
	public Long getTotal(Map<String,Object> map);

}

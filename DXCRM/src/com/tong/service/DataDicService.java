package com.tong.service;

import java.util.List;
import java.util.Map;

import com.tong.entity.DataDic;

/**
 * 数据字典Service接口
 * @author Administrator
 *
 */
public interface DataDicService {

	/**
	 * 查询数据字典集合
	 * @param map
	 * @return
	 */
	public List<DataDic> find(Map<String,Object> map);
	
	/**
	 * 查询所有的数据字典名称集合
	 * @return
	 */
	public List<DataDic> findAll();
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	/**
	 * 修改数据字典
	 * @param dataDic
	 * @return
	 */
	public int update(DataDic dataDic);
	
	/**
	 * 添加数据字典
	 * @param dataDic
	 * @return
	 */
	public int add(DataDic dataDic);
	
	/**
	 * 删除数据字典
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}

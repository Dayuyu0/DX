package com.tong.dao;

import java.util.List;
import java.util.Map;

import com.tong.entity.User;

/*
 * 用户Dao接口
 */
public interface UserDao {

	/**
	 * 用户登录
	 */
	public User login(User user);
	/**
	 * 查询用户集合
	 */
	public List<User> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String,Object> map);
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 添加用户
	 * @param user
	 */
	public int add(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	public int delete(Integer id);
}

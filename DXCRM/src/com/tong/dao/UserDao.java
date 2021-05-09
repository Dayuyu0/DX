package com.tong.dao;

import java.util.List;
import java.util.Map;

import com.tong.entity.User;

/*
 * �û�Dao�ӿ�
 */
public interface UserDao {

	/**
	 * �û���¼
	 */
	public User login(User user);
	/**
	 * ��ѯ�û�����
	 */
	public List<User> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 */
	public Long getTotal(Map<String,Object> map);
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * ����û�
	 * @param user
	 */
	public int add(User user);
	
	/**
	 * ɾ���û�
	 * @param id
	 */
	public int delete(Integer id);
}

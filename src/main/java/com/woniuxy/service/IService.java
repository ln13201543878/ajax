package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.User;

public interface IService {
	void reg(User u);
	void delete(Integer uid);
	void edit(User u);
	User getOne(Integer uid);
	List<User> getAll();
}

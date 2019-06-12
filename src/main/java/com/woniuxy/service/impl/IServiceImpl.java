package com.woniuxy.service.impl;

import java.util.List;

import com.woniuxy.dao.impl.DaoFactory;
import com.woniuxy.entity.User;
import com.woniuxy.service.IService;

public class IServiceImpl implements IService {

	@Override
	public void reg(User u) {
		DaoFactory.getIDaoImpl().save(u);
	}

	@Override
	public void delete(Integer uid) {
		DaoFactory.getIDaoImpl().delete(uid);
	}

	@Override
	public void edit(User u) {
		DaoFactory.getIDaoImpl().update(u);
	}

	@Override
	public User getOne(Integer uid) {
		User u = DaoFactory.getIDaoImpl().findOne(uid);
		return u;
	}

	@Override
	public List<User> getAll() {
		List<User> list = DaoFactory.getIDaoImpl().findAll();
		return list;
	}

}

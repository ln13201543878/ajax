package com.woniuxy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.woniuxy.dao.IDao;
import com.woniuxy.entity.User;
import com.woniuxy.utils.HibernateUtils;

public class IDaoImpl implements IDao {

	@Override
	public void save(User u) {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void delete(Integer uid) {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		User u=s.get(User.class, uid);
		s.delete(u);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void update(User u) {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		s.update(u);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public User findOne(Integer uid) {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		User u=s.get(User.class, uid);
		s.getTransaction().commit();
		s.close();
		return u;
	}

	@Override
	public List<User> findAll() {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		String hql="FROM User";
		Query q = s.createQuery(hql);
		List<User>list=q.list();
		s.getTransaction().commit();
		s.close();
		return list;
	}

}

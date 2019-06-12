package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.entity.User;

public interface IDao {
void save(User u);
void delete(Integer uid);
void update(User u);
User findOne(Integer uid);
List<User> findAll();
}

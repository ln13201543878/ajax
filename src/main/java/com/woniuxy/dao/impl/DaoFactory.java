package com.woniuxy.dao.impl;

import com.woniuxy.dao.IDao;

public class DaoFactory {
public static IDao getIDaoImpl() {
	return new IDaoImpl();
}
	
}

package com.woniuxy.service.impl;

import com.woniuxy.service.IService;

public class IServiceFactory {
public static IService getIServiceImpl() {
	return new IServiceImpl();
}		
}

package com.woniuxy.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.output.WriterOutputStream;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxy.entity.User;
import com.woniuxy.service.impl.IServiceFactory;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	User u=new User();
	public void reg() throws IOException {
		List<User> list = IServiceFactory.getIServiceImpl().getAll();
		for (User us : list) {
			if(us.getUname().equals(u.getUname())) {
				HttpServletResponse response = ServletActionContext.getResponse();
				response.setCharacterEncoding("utf-8");
				PrintWriter pw=response.getWriter();
				pw.print("用户名已存在");
				pw.close();
			}
			System.out.println("进循环了");
		}
		System.out.println("没进循环");
		IServiceFactory.getIServiceImpl().reg(u);
	}
	
	
	
	@Override
	public User getModel() {
		return u;
	}


}

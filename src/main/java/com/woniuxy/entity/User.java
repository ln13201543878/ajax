package com.woniuxy.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer uid;
	private String uname;
	private	Date birthday;
	private Double umoney;
	public User() {
		super();
	}
	public User(Integer uid, String uname, Date birthday, Double umoney) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.birthday = birthday;
		this.umoney = umoney;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getUmoney() {
		return umoney;
	}
	public void setUmoney(Double umoney) {
		this.umoney = umoney;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", birthday=" + birthday + ", umoney=" + umoney + "]";
	}
}

package com.spring;

public class Fetchdata {
	
	private String name;
	private String rollnum;
	private String dept;
	private String mail;
	
	public Fetchdata(String name, String rollnum, String dept, String mail) {
		super();
		this.name = name;
		this.rollnum = rollnum;
		this.dept = dept;
		this.mail = mail;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollnum() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "Fetchdata [name=" + name + ", rollnum=" + rollnum + ", dept=" + dept + ", mail=" + mail + "]";
	}

}

package com.hzit.entity;

public class student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String major;
	private String addr;
	public student() {
		super();
	}

	public student(int id, String name, int age, String sex, String major, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.major = major;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", major=" + major + ", addr="
				+ addr + "]";
	}
}

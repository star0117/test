package com.hzit.entity;

public class Admin {
	private int id;
	private String name;
	private String psd;
	private String type;
	public Admin() {
		super();
	}

	public Admin(int id, String name, String psd, String type) {
		super();
		this.id = id;
		this.name = name;
		this.psd = psd;
		this.type = type;
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
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", psd=" + psd + ", type=" + type + "]";
	}
	
}

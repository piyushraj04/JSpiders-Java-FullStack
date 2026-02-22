package org.jsp.springcore.Test01;

import java.util.List;

public class Company {
	private int id;
	private String name;
	private String website;
	List <String> list;
	
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", website=" + website + ", list=" + list + "]";
	}
	
	

}

package com.model;

public class Employee {

	private int e_id;
	private String e_name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String e_name) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + "]";
	}
	
	
}

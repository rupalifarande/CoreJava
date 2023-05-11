package com.model;

public class Company {
	private int  c_id;
	private String c_name;
    private Employee employee;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int c_id, String c_name, Employee employee) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.employee = employee;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", c_name=" + c_name + ", employee=" + employee + "]";
	}
    
    
	
}

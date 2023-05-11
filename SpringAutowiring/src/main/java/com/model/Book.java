package com.model;

public class Book {
	private int b_id;
	private String book_name;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int b_id, String book_name) {
		super();
		this.b_id = b_id;
		this.book_name = book_name;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", book_name=" + book_name + "]";
	}
	
	
	
	

}

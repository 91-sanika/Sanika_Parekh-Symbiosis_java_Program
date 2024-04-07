package com.LibraryBooks;

public class Book {
	
	private String student_name;
	private int SID;
	private int bookID;
	private String book_name;
	
	public String getStudent_name() {
		return student_name;
	}
	
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public int getSID() {
		return SID;
	}
	
	public void setSID(int sID) {
		SID = sID;
	}
	public int getBookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getBook_name() {
		return book_name;
	}
	
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}

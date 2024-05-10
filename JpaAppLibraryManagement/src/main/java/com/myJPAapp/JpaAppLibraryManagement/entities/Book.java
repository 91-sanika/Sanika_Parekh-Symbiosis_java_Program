package com.myJPAapp.JpaAppLibraryManagement.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int BookId;
	
	private String BookName;
	
	private String BookAuthor;
	
	@ManyToMany(mappedBy="book")
	private List<Borrower> borrower = new ArrayList<Borrower>();

	public List<Borrower> getBorrower() {
		return borrower;
	}

	public void setBorrower(List<Borrower> borrower) {
		this.borrower = borrower;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + "]";
	}
}

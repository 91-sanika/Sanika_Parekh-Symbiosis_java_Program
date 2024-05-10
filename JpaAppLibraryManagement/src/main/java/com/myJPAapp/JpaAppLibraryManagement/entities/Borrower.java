package com.myJPAapp.JpaAppLibraryManagement.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Borrower {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BorrowerId;
	
	private String BorrowerName;
	
//	private int BookId;
//	
//	private String BookName;
	
	@ManyToMany
	@JoinTable(
		    name = "borrower_book",
		    joinColumns = @JoinColumn(name ="BorrowerId"),
		    inverseJoinColumns = @JoinColumn(name ="BookId")
		    		)
	private List<Book> book = new ArrayList<Book>();

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Borrower(int borrowerId, String borrowerName, int bookId, String bookName) {
		super();
		BorrowerId = borrowerId;
		BorrowerName = borrowerName;
//		BookId = bookId;
//		BookName = bookName;
	}

	public int getBorrowerId() {
		return BorrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		BorrowerId = borrowerId;
	}

	public String getBorrowerName() {
		return BorrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		BorrowerName = borrowerName;
	}

//	public int getBookId() {
//		return BookId;
//	}
//
//	public void setBookId(int bookId) {
//		BookId = bookId;
//	}

//	public String getBookName() {
//		return BookName;
//	}
//
//	public void setBookName(String bookName) {
//		BookName = bookName;
//	}

	@Override
	public String toString() {
		return "Borrower [BorrowerId=" + BorrowerId + ", BorrowerName=" + BorrowerName + ", BookId=" + /*BookId
				+ ", BookName=" + BookName +*/ "]";
	}
}

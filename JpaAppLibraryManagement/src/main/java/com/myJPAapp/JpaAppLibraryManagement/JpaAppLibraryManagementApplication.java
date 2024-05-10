package com.myJPAapp.JpaAppLibraryManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myJPAapp.JpaAppLibraryManagement.entities.Book;
import com.myJPAapp.JpaAppLibraryManagement.entities.Borrower;
import com.myJPAapp.JpaAppLibraryManagement.entities.repo.BookRepository;
import com.myJPAapp.JpaAppLibraryManagement.entities.repo.BorrowerRepository;
import com.myJPAapp.JpaApplication.entities.Employee;

@SpringBootApplication
public class JpaAppLibraryManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaAppLibraryManagementApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		BorrowerRepository repository1 = context.getBean(BorrowerRepository.class);
		
//		Book bo = new Book();
//		bo.setBookId(1);
//		bo.setBookName("Java");
//		bo.setBookAuthor("James Gosling");
//		
//		Book bo1 = new Book();
//		bo1.setBookId(2);
//     	bo1.setBookName("Python");
//		bo1.setBookAuthor("Guido van Rossum");
//		
//		Book bo2 = new Book();
//		bo2.setBookId(3);
//		bo2.setBookName("Data Structure");
//		bo2.setBookAuthor("Klaus Samelson");
//		
//		
//     	Borrower br = new Borrower();
//		//br.setBorrowerId(101);
//     	br.setBorrowerName("Sanika");
////		br.setBookId(1);
////		br.setBookName("Java");
////		
//		Borrower br1 = new Borrower();
//		//br1.setBorrowerId(102);
//		br1.setBorrowerName("Sharda");
////		br1.setBookId(2);
////		br1.setBookName("Python");
////		
//    	Borrower br2 = new Borrower();
//		//br2.setBorrowerId(103);
//		br2.setBorrowerName("kavita");
////		br2.setBookId(3);
////		br2.setBookName("Data Structure");
//	
//		List<Book> b = new ArrayList<Book>();
//		b.add(bo);
//		b.add(bo1);
//		b.add(bo2);
//		
//	    List<Borrower> bow = new ArrayList<Borrower>();
//	    bow.add(br);
//	    bow.add(br1);
//	    bow.add(br2);
//	    
//	    bo.setBorrower(bow);
//	    bo1.setBorrower(bow);
//	    bo2.setBorrower(bow);
//	    
//	    br.setBook(b);
//	    br1.setBook(b);
//	    br2.setBook(b);
//		
//	 repository.save(bo);
//	 repository.save(bo1);
//	 repository.save(bo2);
//
//	 repository1.save(br);
//	 repository1.save(br1);
//	 repository1.save(br2);
//	 
//		repository.saveAll(b);
//		repository1.saveAll(bow);
		
		
		//get the data from BOOK
//		Optional<Book>findById = repository.findById(1);
//		Book boo = findById.get();
//		System.out.println(boo);
//				
//				
//		// get the data from Borrower
//		Optional<Borrower>findById1 = repository1.findById(1);
//		Borrower be = findById1.get();
//		System.out.println(be);
		
		//set the data or update the data for Book
//		Optional<Book>findById= repository.findById(3);
//		Book book1 = findById.get();
//		book1.setBookName("C Language");
//		book1.setBookAuthor("Dennis MacAlistair Ritchie");
//		System.out.println(book1);
//		repository.save(book1);
				
		//set the data or update the data for borrower
//		Optional<Borrower>findById= repository1.findById(3);
//		Borrower bor= findById.get();
//		bor.setBorrowerName("Ranjana");
//		repository1.save(bor);	
				
		//read all the data from Book and borrower
		
//		Iterable<Book> findAll = repository.findAll();
//		Iterator<Book> iterator = findAll.iterator();
//     	while(iterator.hasNext()) {
//		System.out.println(iterator.next());
		
		Iterable<Borrower> findAll1 = repository1.findAll();
		Iterator<Borrower> iterator1 = findAll1.iterator();
     	while(iterator1.hasNext()) {
		System.out.println(iterator1.next());
     	}
     	
    	// Delete the data 
		//repository.deleteById(3);
		//repository1.deleteById(504);
		//it cannot delete the id because we have given foreign key as a reference 
     	}
	}


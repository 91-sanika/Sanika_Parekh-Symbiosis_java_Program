package com.myJPAapp.JpaAppLibraryManagement.entities.repo;

import org.springframework.data.repository.CrudRepository;

import com.myJPAapp.JpaAppLibraryManagement.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

}

package com.myJPAapp.JpaAppLibraryManagement.entities.repo;

import org.springframework.data.repository.CrudRepository;

import com.myJPAapp.JpaAppLibraryManagement.entities.Borrower;

public interface BorrowerRepository extends CrudRepository<Borrower,Integer>{

}

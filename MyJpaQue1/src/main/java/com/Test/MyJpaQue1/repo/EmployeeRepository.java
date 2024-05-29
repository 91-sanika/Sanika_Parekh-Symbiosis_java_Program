package com.Test.MyJpaQue1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Test.MyJpaQue1.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

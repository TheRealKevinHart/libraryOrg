package com.springboot.libraryOrg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

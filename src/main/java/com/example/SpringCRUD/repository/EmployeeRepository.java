package com.example.SpringCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringCRUD.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

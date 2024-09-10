package com.demo.Ashututorial.tutorial.repositories;

import com.demo.Ashututorial.tutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeEntity,Long> {

}

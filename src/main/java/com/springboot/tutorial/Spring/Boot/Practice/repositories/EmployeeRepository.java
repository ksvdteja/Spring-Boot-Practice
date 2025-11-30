package com.springboot.tutorial.Spring.Boot.Practice.repositories;

import com.springboot.tutorial.Spring.Boot.Practice.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}


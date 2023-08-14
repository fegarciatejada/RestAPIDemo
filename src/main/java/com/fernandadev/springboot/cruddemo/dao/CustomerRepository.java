package com.fernandadev.springboot.cruddemo.dao;

import com.fernandadev.springboot.cruddemo.entity.Customer;
import com.fernandadev.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
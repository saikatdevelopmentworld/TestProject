package com.saikat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saikat.demo.classes.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	@Query(value = "select * from customer1", nativeQuery = true)
	List<Customer> findAllCustomer();
}

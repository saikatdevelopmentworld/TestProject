package com.saikat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.saikat.demo.classes.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	@Query(value = "select * from hotel1", nativeQuery = true)
	List<Hotel> findAllHotel();
	
	

}

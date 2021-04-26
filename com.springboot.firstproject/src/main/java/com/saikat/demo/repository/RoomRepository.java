package com.saikat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.saikat.demo.classes.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	
	@Query(value = "select * from room1", nativeQuery = true)
	List<Room> findAllCustomer();	

}

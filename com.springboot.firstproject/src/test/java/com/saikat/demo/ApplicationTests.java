package com.saikat.demo;

import org.junit.jupiter.api.Test;
import com.saikat.demo.classes.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.saikat.demo.repository.CustomerRepository;
import com.saikat.demo.repository.HotelRepository;
import com.saikat.demo.repository.RoomRepository;
import java.util.*;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
}
	@Autowired
	HotelRepository hotelRepo;
	
	@Autowired
	RoomRepository roomRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Test
	public void testRoom() {
		Room room = new Room();
		room.setBedType("King");
		room.setOccupantName("Milton");
		room.setRating(4.7);
		room.setSmoking('Y');
		room.setRoomNumber(102);
		roomRepo.save(room);
		System.out.println(roomRepo.findAllCustomer());
		System.out.println("Stored room data");
	}
	@Test
	public void testHotel()
	{
		Hotel h=new Hotel();
		h.setHotelName("Hotel xyz");
		h.setNumberOfRooms(12);
		h.setLocation("california");
		h.setOccupiedCount(1);
		hotelRepo.save(h);
		System.out.println(hotelRepo.findAllHotel());
		System.out.println("stored hoteldata");
	}
	
	
	@Test
	public void testCustomer() {
		Customer customer = new Customer();
		customer.setRoomNumber(859);
		customer.setHotelName("abc55");
		customerRepo.save(customer);
		System.out.println("stored customerdata");

		//List<Customer> list=customerRepo.findAllCustomer();
		//System.out.println(list);
	}
	
	

}

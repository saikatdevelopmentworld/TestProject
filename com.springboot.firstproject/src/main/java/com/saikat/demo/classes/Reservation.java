package com.saikat.demo.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Reservation {
	@Autowired
	private Room room;
	private List<Room> list;
	private List<Hotel> list1;
	private static final int NOT_FOUND = -1;
	
	public void addReservation(String occupantName, char smoking, String bedType ) {
		
		
	}
	
	public void cancelReservation() {
		findReservation();
	}
	
	private int findReservation() {
		
		return NOT_FOUND;
		
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public List<Room> getList() {
		return list;
	}
	public void setList(List<Room> list) {
		this.list = list;
	}
	
	
	
	

}

package com.saikat.demo.classes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Entity
@Table(name ="customer1")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private int roomNumber;
	private String hotelName;
	
	//@OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL, fetch = FetchType.ALL);
	//private Set<Room> room;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getHotelName() {
		return "hotelName";
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roomNumber+" : "+hotelName;
	}
	/*
	 * public Hotel getHotel() { return hotel; } public void setHotel(Hotel hotel) {
	 * this.hotel = hotel; } public Room getRoom() { return room; } public void
	 * setRoom(Room room) { this.room = room; }
	 */
}

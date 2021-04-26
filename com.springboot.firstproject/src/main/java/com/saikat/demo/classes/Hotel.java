package com.saikat.demo.classes;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name = "hotel1")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "HotelName")
	private String hotelName;
	
	private int numberOfRooms;
	private String location;
	private int occupiedCount;
	
	//private Room room;
	
	public boolean isEmpty() {
		if(occupiedCount == 0) {
			return true;
	}
		
		else
			return false;
	}
	public boolean isFull() {
		if(numberOfRooms == occupiedCount) {
			return true;
		}
		else
		return false;
	}
	//Add new room details
/*	public void addRoom(int roomNumber, String bedType, char smoking, double rating, boolean isOccupied) {
		isOccupied = false;
		room.setRoomNumber(roomNumber);
		room.setBedType(bedType);
		room.setSmoking(smoking);
		room.setRating(rating);
		
		this.numberOfRooms ++;
		
		System.out.println("Room number : " + roomNumber + "\n"
				+"Occupant Name: " + room.getOccupantName() + "\n"
				+"Smoking Room: " + room.getSmoking() + "\n"
				+"Bed Type: " + bedType + "\n"
				+"Rating: " + rating + "\n"
				+"Occupant Name: " + room.getOccupantName()+ 
				"Room Occupied: " + isOccupied + "\n"+
				"NumberOfRooms: " + numberOfRooms + "\n"+
				"\n \n");
		
	}
	
	
	*/
	

	
	public void display() {
		System.out.println("The hotel object is running");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOccupiedCount() {
		return occupiedCount;
	}
	public void setOccupiedCount(int occupiedCount) {
		this.occupiedCount = occupiedCount;
	}
}

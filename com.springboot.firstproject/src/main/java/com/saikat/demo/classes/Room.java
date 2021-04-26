package com.saikat.demo.classes;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;






@Entity
@Table(name = "room1")
public class Room {
	@Id 
	int roomNumber;
	private String bedType;
	private char smoking;
	private boolean roomOccupied;
	private String occupantName;
	private double rating;
	
	//@ManyToOne
	//@JoinColumn(name = "customer_id")
	//private Customer customer;
	
	public Room() {
		
	}
	
	public Room(int roomNumber, String bedType, char smoking, double rating) {
		this.roomNumber = roomNumber;
		this.bedType = bedType;
		this.smoking = smoking;
		this.rating = rating;
		
	}
	
	@Override
	public String toString() {
		return "Room number : " + roomNumber + "\n"
				+"Occupant Name: " + occupantName + "\n"
				+"Smoking Room: " + smoking + "\n"
				+"Bed Type: " + bedType + "\n"
				+"Rating: " + rating + "\n"
				+"Occupant Name: " + occupantName + "\n \n";
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public char getSmoking() {
		return smoking;
	}
	public void setSmoking(char smoking) {
		this.smoking = smoking;
	}
	public boolean isRoomOccupied() {
		return roomOccupied;
	}
	public void setRoomOccupied(boolean roomOccupied) {
		this.roomOccupied = roomOccupied;
	}
	public String getOccupantName() {
		return occupantName;
	}
	public void setOccupantName(String occupantName) {
		this.occupantName = occupantName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
}

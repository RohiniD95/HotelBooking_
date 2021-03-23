package com.hotelbooking.resource;

public class RoomDetails {

	private int roomNumber;
	private int roomPrice;
	
	public RoomDetails() {
		super();
	}
	public RoomDetails(int roomNumber, int roomPrice) {
		super();
		this.roomNumber = roomNumber;
		this.roomPrice = roomPrice;
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	
	
}

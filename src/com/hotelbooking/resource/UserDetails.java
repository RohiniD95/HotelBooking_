package com.hotelbooking.resource;

public class UserDetails {

	private String name;
	private int intialBonusPoints;
	private int updatedbonusPoints;
	
	
	public UserDetails() {
		super();
	}


	public UserDetails(String name, int intialBonusPoints) {
		super();
		this.name = name;
		this.intialBonusPoints = intialBonusPoints;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIntialBonusPoints() {
		return intialBonusPoints;
	}


	public void setIntialBonusPoints(int intialBonusPoints) {
		this.intialBonusPoints = intialBonusPoints;
	}


	public int getUpdatedbonusPoints() {
		return updatedbonusPoints;
	}


	public void setUpdatedbonusPoints(int updatedbonusPoints) {
		this.updatedbonusPoints = updatedbonusPoints;
	}
	
	
	
}

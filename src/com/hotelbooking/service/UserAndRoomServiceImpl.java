package com.hotelbooking.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.hotelbooking.resource.RoomDetails;
import com.hotelbooking.resource.UserDetails;

public class UserAndRoomServiceImpl {

	 public ArrayList<RoomDetails> getRoomDetails(){
		 ArrayList<RoomDetails> list = new ArrayList<>();
		 
		 RoomDetails room1 = new RoomDetails(1, 500);
		 RoomDetails room2 = new RoomDetails(2, 300);
		 RoomDetails room3 = new RoomDetails(3, 2000);
		 
		 list.add(room1);
		 list.add(room2);
		 list.add(room3);
		 
		return list;
		 
		 
	 }
	 
	 public ArrayList<UserDetails> getUserDetails(){
		 ArrayList<UserDetails> list = new ArrayList<>();
		 
		 UserDetails user1 = new UserDetails("Rohini", 1000);
		 UserDetails user2 = new UserDetails("John", 200);
		 UserDetails user3 = new UserDetails("James", 300);
		 
		 list.add(user1);
		 list.add(user2);
		 list.add(user3);
		 
		return list;
		 
	 }
	 
	 public HashMap<String, Integer> getUserMap(){
		 HashMap<String, Integer> userDataList = new HashMap<String, Integer>();
		 ArrayList<UserDetails> list = getUserDetails();
		 for(UserDetails user: list) {
			 userDataList.put(user.getName(), Integer.valueOf(user.getIntialBonusPoints()));			 
		 }
		return userDataList;
		 
	 }
}

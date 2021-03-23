package com.hotelbooking.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.resource.RoomDetails;
import com.hotelbooking.resource.UserDetails;
import com.hotelbooking.service.UserAndRoomServiceImpl;


@RestController
public class HotelBookingController {
	
	@Autowired
	public UserAndRoomServiceImpl userAndRoomServiceImpl;

	 @RequestMapping(value="/book",method = RequestMethod.POST)
	 public String bookRoom(@RequestParam("userName") String userName) {
		 ArrayList<RoomDetails> roomDetails = userAndRoomServiceImpl.getRoomDetails();
		 String response = "";
		
		 HashMap<String, Integer> userDetailsMap = userAndRoomServiceImpl.getUserMap();
		
		if (userDetailsMap.keySet().contains(userName)) {
			int initialBonusPoints = userDetailsMap.get(userName);
			Iterator itr = roomDetails.iterator();
			while (itr.hasNext()) {
				RoomDetails singleRoomDetail =(RoomDetails) itr.next();
			//for (RoomDetails singleRoomDetail : roomDetails) {
				if (initialBonusPoints == singleRoomDetail.getRoomPrice() || initialBonusPoints >= singleRoomDetail.getRoomPrice()) {
					response = "Room number " + singleRoomDetail.getRoomNumber() + " is Booked. "+"Your available bonus points are- "
				+(initialBonusPoints-singleRoomDetail.getRoomPrice());
					break;
				} else if (initialBonusPoints <= singleRoomDetail.getRoomPrice()) {
					itr.remove();
					if(roomDetails.size()==0) {
						response = "Approval is pending. You may need to pay additional charges,"
								+"as your bonus points are not sufficient to do the payment ";
						break;
					}else {
						if(roomDetails.size()>0) {
							continue;
						}
					}
					
				}
			}
		}
	      return response;
	   }
	 
	
}

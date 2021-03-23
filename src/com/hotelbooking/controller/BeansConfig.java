package com.hotelbooking.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotelbooking.service.UserAndRoomServiceImpl;

@Configuration
public class BeansConfig {

		@Bean
	    public UserAndRoomServiceImpl userAndRoomServiceImpl() {
	        return new UserAndRoomServiceImpl();
	    }
}

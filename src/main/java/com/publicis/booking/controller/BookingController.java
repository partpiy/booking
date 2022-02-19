package com.publicis.booking.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;

import com.publicis.booking.controller.model.BookingRequest;
import com.publicis.booking.controller.model.BookingResponse;
import com.publicis.booking.controller.model.User;
import com.publicis.booking.service.BookingService;

public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/reserve")
	BookingResponse reserve(HttpServletRequest request, Principal principal, BookingRequest bookingRequest) {
		Authentication authentication = (Authentication) principal;
		User user = (User) authentication.getPrincipal();
		bookingRequest.setUserId(user.getUserId());
		return bookingService.book(bookingRequest);
	}

}

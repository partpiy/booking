package com.publicis.booking.controller.model;

import java.util.List;

public class BookingResponse {
	private Long bookingId;
	
	private List<ShowSeating> seats;
	
	private BookingStatus bookingStatus;
	
	private String error;



	public BookingResponse(Long bookingId, List<ShowSeating> seats, BookingStatus bookingStatus, String error) {
		super();
		this.bookingId = bookingId;
		this.seats = seats;
		this.bookingStatus = bookingStatus;
		this.error = error;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public List<ShowSeating> getSeats() {
		return seats;
	}

	public void setSeats(List<ShowSeating> seats) {
		this.seats = seats;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}

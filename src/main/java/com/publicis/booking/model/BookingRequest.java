package com.publicis.booking.controller.model;

import java.util.List;
import java.util.UUID;

public class BookingRequest {
	private UUID userId;
	
	private List<UUID> showSeats;
	
	private UUID discount;
	
	private BookingRequestType requestType;
	
	private UUID paymentId;
	
	private Long showId;

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public List<UUID> getShowSeats() {
		return showSeats;
	}

	public void setShowSeats(List<UUID> showSeats) {
		this.showSeats = showSeats;
	}

	public UUID getDiscount() {
		return discount;
	}

	public void setDiscount(UUID discount) {
		this.discount = discount;
	}

	public BookingRequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(BookingRequestType requestType) {
		this.requestType = requestType;
	}

	public UUID getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(UUID paymentId) {
		this.paymentId = paymentId;
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}
	
	
}

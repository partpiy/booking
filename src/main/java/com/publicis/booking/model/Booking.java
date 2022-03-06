package com.publicis.booking.controller.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table
public class Booking {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="user_id")
	private UUID userId;
	
	@Column(name="show_id")
	private Long showId;
	
	@Column(name="booking_time")
	private LocalDateTime bookingTime;
	
	@Column(name="booking_amount")
	private Double bookingAmount;
	
	@Column(name="booking_status")
	private BookingStatus bookingStatus;
	
	@Column(name="payment_detail_id")
	private UUID paymentDetailId;
	
	@Version
    private int version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public Double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public UUID getPaymentDetailId() {
		return paymentDetailId;
	}

	public void setPaymentDetailId(UUID paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}
	
	
	
	
	
}

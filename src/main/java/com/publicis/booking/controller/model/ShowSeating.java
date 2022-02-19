package com.publicis.booking.controller.model;

import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;


@Entity
@javax.persistence.Table
public class ShowSeating {
	@Id
	@GeneratedValue
	private UUID id;
	
	@javax.persistence.Column(name="show_id")
	private UUID showId;
	
	@Column(name="seat_class")
	private SeatClass seatClass;
	
	@Column(name="row")
	private String row;
	
	@Column(name="row_seat")
	private String rowSeat;
	
	
	@Column(name="price")
	private Double price;

	@Column(name="seat_status")
	private SeatStatus seatStatus;
	
	@Column(name="booking_id")
	private Long bookingId;
	
	
	@Version
    private int version;
	
	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public UUID getShowId() {
		return showId;
	}


	public void setShowId(UUID showId) {
		this.showId = showId;
	}


	public SeatClass getSeatClass() {
		return seatClass;
	}


	public void setSeatClass(SeatClass seatClass) {
		this.seatClass = seatClass;
	}


	public String getRow() {
		return row;
	}


	public void setRow(String row) {
		this.row = row;
	}


	public String getRowSeat() {
		return rowSeat;
	}


	public void setRowSeat(String rowSeat) {
		this.rowSeat = rowSeat;
	}


	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public SeatStatus getSeatStatus() {
		return seatStatus;
	}


	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}


	public Long getBookingId() {
		return bookingId;
	}


	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	
	
	
}

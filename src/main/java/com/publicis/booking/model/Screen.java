package com.publicis.booking.controller.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Entity
public class Screen {
	@PrimaryKey
	@GeneratedValue
	private Long id;

	@Column("theatre_id")
	private Long theatreId;

	@Column("screen_desc")
	private String screenDescription;

	@Column("seat_count")
	private int seatCount;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenDescription() {
		return screenDescription;
	}

	public void setScreenDescription(String screenDescription) {
		this.screenDescription = screenDescription;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	

}

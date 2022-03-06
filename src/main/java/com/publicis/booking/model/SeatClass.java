package com.publicis.booking.controller.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Entity
@Table
public class SeatClass {
	@PrimaryKey
	@GeneratedValue
	private Long id;
	
	@Column("description")
	private String seatDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeatDescription() {
		return seatDescription;
	}

	public void setSeatDescription(String seatDescription) {
		this.seatDescription = seatDescription;
	}
}

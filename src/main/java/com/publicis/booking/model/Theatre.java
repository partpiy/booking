package com.publicis.booking.controller.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Entity
@Table
public class Theatre {
	@PrimaryKey
	@GeneratedValue
	private Long id;
	
	@Column("theatre_name")
	private String theatreName;
	
	@Column("city_id")
	private Long cityId;
	
	@Column("screen_count")
	private int screenCount;
	
	@Column("address")
	private String address;
	
	@Column("zip_code")
	private String zipCode;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public int getScreenCount() {
		return screenCount;
	}

	public void setScreenCount(int screenCount) {
		this.screenCount = screenCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}

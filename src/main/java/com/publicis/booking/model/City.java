package com.publicis.booking.controller.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Entity
@Table
public class City {
	@PrimaryKey
	@GeneratedValue
	private Long id;

	@Column("city_name")
	private String cityName;
	
	@Column("country_id")
	private Long countryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
}

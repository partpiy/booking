package com.publicis.booking.controller.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class PaymentDetails {
	@Id
	private UUID id;
	
	@Column(name = "payment_gateway")
	private Long paymentGateway;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name="payment_ref")
	private String paymentRef;
	
	@Column(name="status")
	private PaymentStatus paymentStatus;
	
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

	public Long getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(Long paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPaymentRef() {
		return paymentRef;
	}

	public void setPaymentRef(String paymentRef) {
		this.paymentRef = paymentRef;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	
	
}

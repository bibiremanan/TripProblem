package com.tripproblem.tripsservice.model;

public class Trips {
	private long Id ;
	private	String userId;
	private	int tripId;
	private String ackStatus;
	private String bookingStatus;
	private Double price;
	
	public Trips(long id, String userId, int tripId, String ackStatus, String bookingStatus, Double price) {
		super();
		Id = id;
		this.userId = userId;
		this.tripId = tripId;
		this.ackStatus = ackStatus;
		this.bookingStatus = bookingStatus;
		this.price = price;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public String getAckStatus() {
		return ackStatus;
	}
	public void setAckStatus(String ackStatus) {
		this.ackStatus = ackStatus;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}

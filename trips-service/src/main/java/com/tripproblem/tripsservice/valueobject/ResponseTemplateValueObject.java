package com.tripproblem.tripsservice.valueobject;

import com.tripproblem.tripsservice.model.Trips;

public class ResponseTemplateValueObject {
private User user;
private Trips trips;
public ResponseTemplateValueObject() {
	super();
	this.user = user;
	this.trips = trips;
}

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Trips getTrips() {
	return trips;
}
public void setTrips(Trips trips) {
	this.trips = trips;
}
}

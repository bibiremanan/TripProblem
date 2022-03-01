package com.tripproblem.tripsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripproblem.tripsservice.model.Trips;
import com.tripproblem.tripsservice.service.TripService;
import com.tripproblem.tripsservice.valueobject.ResponseTemplateValueObject;

@RestController
@RequestMapping("/trips")
public class TripController {

	@Autowired
	private TripService tripService;

	@PostMapping("/")
	public Trips saveTrip(@RequestBody Trips trips) {
		return tripService.saveTrip(trips);
	}

	@GetMapping("/{id}")
	public ResponseTemplateValueObject getTripsWithUser(@PathVariable("id") Long id) {
		return tripService.getTripsWithUser(id);
	}

	@GetMapping("/allTrips")
	public List<Trips> getAllTripsDetails() {
		return tripService.getAllTrips();
	}

	@DeleteMapping("/{id}")
	public void deleteTrip(@PathVariable long id) {
		tripService.deleteTrip(id);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllTrips() {
		tripService.deleteAllTrips();
	}
}
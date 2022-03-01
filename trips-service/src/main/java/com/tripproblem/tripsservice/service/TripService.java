package com.tripproblem.tripsservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripproblem.tripsservice.exception.ResourceNotFoundException;
import com.tripproblem.tripsservice.model.Trips;
import com.tripproblem.tripsservice.repository.TripsRepo;
import com.tripproblem.tripsservice.valueobject.ResponseTemplateValueObject;
import com.tripproblem.tripsservice.valueobject.User;

@Service
public class TripService {
	@Autowired
	private TripsRepo tripsRepo;
	@Autowired
	private RestTemplate restTemplate;

	public Trips saveTrip(Trips trips) {
		return tripsRepo.save(trips);
	}

	public ResponseTemplateValueObject getTripsWithUser(Long id) {

		ResponseTemplateValueObject valueobjects = new ResponseTemplateValueObject();
		Trips trips = tripsRepo.findTripsById(id);

		User user = restTemplate.getForObject("http://localhost/users/" + trips.getUserId(), User.class);

		valueobjects.setUser(user);
		valueobjects.setTrips(trips);

		return valueobjects;
	}

	public List<Trips> getAllTrips() {
		List<Trips> trips = new ArrayList<>();
		tripsRepo.findAll().forEach(trips::add);
		return trips;
	}

	public void deleteTrip(long id) {

		Trips existingTrip = tripsRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Trip not found with id :" + id));
		tripsRepo.delete(existingTrip);

	}

	public void deleteAllTrips() {
		tripsRepo.deleteAll();
	}

}
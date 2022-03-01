package com.tripproblem.tripsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripproblem.tripsservice.model.Trips;

@Repository
public interface TripsRepo extends JpaRepository <Trips, Long>  {

	Trips findTripsById(Long id);

	

}

package com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// Repository -> classe que estabelece a comunicação com o BD e a manipulação dele
public interface TripRepository extends JpaRepository<Trip, UUID> {

}

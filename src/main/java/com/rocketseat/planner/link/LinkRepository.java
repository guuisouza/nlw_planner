package com.rocketseat.planner.link;

import com.rocketseat.planner.link.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

// É passado o tipo da entidade e tipo da chave primária entre < >
public interface LinkRepository extends JpaRepository<Link, UUID> {
    List<Link> findByTripId(UUID tripId);
}

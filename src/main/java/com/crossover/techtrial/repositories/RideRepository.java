/**
 * 
 */
package com.crossover.techtrial.repositories;

import java.util.Optional;

import com.crossover.techtrial.model.Ride;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author crossover
 *
 */
@RestResource(exported = false)
public interface RideRepository extends CrudRepository<Ride, Long> {

	Optional<Ride> findById(Long rideId);

}

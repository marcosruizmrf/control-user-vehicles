package com.zup.users.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.users.models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	public Iterable<List<Vehicle>> findByIdContaining(Long idVehicle);



}

package com.zup.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zup.users.models.Vehicle;
import com.zup.users.repositories.VehicleRepository;

@RestController
@RequestMapping("/veiculos")
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@GetMapping(path = "/vehicle/{idVehicle}")
	public Iterable<List<Vehicle>> obterId(@PathVariable Long idVehicle) {
		return vehicleRepository.findByIdContaining(idVehicle);
	}
	
	@GetMapping
	public List<Vehicle> listar() {
		return vehicleRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vehicle adicionar(@RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	
}

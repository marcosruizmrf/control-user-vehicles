package com.zup.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zup.users.models.Vehicle;
import com.zup.users.repositories.ApiFipe;
import com.zup.users.repositories.VehicleRepository;
import com.zup.users.services.VehicleService;

@RestController
@RequestMapping("/veiculos")
@FeignClient(name = "precoVeiculo" , url = "https://parallelum.com.br/fipe/api/v1")
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private VehicleService service;
	
	@Autowired
	private ApiFipe apiFipe;
	
	
	
	
	@GetMapping(value = "/user/{idUser}")
	public List listaUserVehicle(@PathVariable Long idUser) {
		return vehicleRepository.findByIdUser(idUser);
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
	
		
	@GetMapping(value = "/{precoveiculo}")
	
	public Vehicle getVehicle() {
		return apiFipe.getVehicle();
	}

	
}

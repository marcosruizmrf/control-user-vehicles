package com.zup.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.users.models.Vehicle;
import com.zup.users.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repository;
	
	public List<Vehicle> findByIdUser(Long idUser) {
		List<Vehicle> list = repository.findByIdUser(idUser);
		return list;
	}
	
	

}

package com.zup.users.repositories;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zup.users.models.Vehicle;

@FeignClient(name = "precoVeiculo" , url = "https://parallelum.com.br/fipe/api/v1/carros/marcas")
public interface ApiFipe {

    @RequestMapping(method = RequestMethod.GET, value = "")
    List<Vehicle> getVehicle();
}

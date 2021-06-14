package com.zup.users.repositories;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "usuarios", url = "https://parallelum.com.br/fipe/api/v1")
public interface ApiExterna {

}

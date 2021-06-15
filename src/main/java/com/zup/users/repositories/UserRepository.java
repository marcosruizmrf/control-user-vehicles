package com.zup.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.users.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	//public Iterable<List<User>> findAllByid(Long idUser);
		
	
}
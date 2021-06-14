package com.zup.users.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.users.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public Iterable<List<User>> findByIdContaining(Long idUser);
		
	
}
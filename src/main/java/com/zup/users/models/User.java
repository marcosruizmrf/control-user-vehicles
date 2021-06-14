package com.zup.users.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")	
	private Long idUser;
	
	@Column(nullable = false, length = 50, unique=true)	
	private String nome;
	
	@Column(nullable = false, length = 50, unique=true)	
	private String email;
	
	@Column(nullable = false, length = 50, unique=true)
	private Long cpf;
	
	private Date data;
	
	@OneToMany(mappedBy = "idVehicle", cascade = CascadeType.ALL)
	private List<Vehicle> vehicles = new ArrayList<>();
	
		
	public User() {
		super();
	}
		
	public User(Long idUser, String nome, String email, Long cpf, Date data, List<Vehicle> vehicles) {
		super();
		this.idUser = idUser;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.data = data;
		this.vehicles = vehicles;
	}


	public Long getId() {
		return idUser;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}


	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}

	public void setId(Object obj) {
		
	}

	
}


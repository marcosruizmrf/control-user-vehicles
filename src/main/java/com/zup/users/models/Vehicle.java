package com.zup.users.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idVehicle")
	public Long idVehicle;
	
	@Column(nullable = false, length = 50)
	private String marca;
	
	@Column(nullable = false, length = 50)
	private String modelo;
	
	@Column(nullable = false, length = 50)
	private int ano;
		
	
	public Vehicle() {
	}
	
		
	public Vehicle(Long idVehicle, String marca, String modelo, int ano) {
		super();
		this.idVehicle = idVehicle;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}


	public Long getIdVehicle() {
		return idVehicle;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


}

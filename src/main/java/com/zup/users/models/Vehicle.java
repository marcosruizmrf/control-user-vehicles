package com.zup.users.models;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length = 50)
	public Long id;
	
	@Column(nullable = false, length = 50)
	private String marca;
	
	@Column(nullable = false, length = 50)
	private String modelo;
	
	@Column(nullable = false, length = 50)
	private int ano;
	
	private Double preco;
	
	@Column(nullable = false, length = 50)
	public Long idUser;
	

	public Vehicle() {
	}
	

	public Vehicle(Long id, String marca, String modelo, int ano, Long idUser) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.idUser = idUser;
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
	
	
	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public void eRodizio(int rodizio) {
		//rodizio = getAno() % 10;

		switch (rodizio) {
		case 0 & 1:
			System.out.println(2);
			break;
		case 2 & 3:
			System.out.println(3);
			break;
		case 4 & 5:
			System.out.println(4);
			break;
		case 6 & 7:
			System.out.println(5);
			break;
		case 8 & 9:
			System.out.println(6);
			break;
		}

	}

	public boolean rodizioAtivo(int ativo, int rodizio) throws ParseException {

		Date today = new Date();
		Date date = new Date(today.getTime());

		System.out.println("Today is: " + date);

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(today);

		System.out.println("Day of the week: " + cal.get(Calendar.DAY_OF_WEEK));

		if (rodizio == cal.get(Calendar.DAY_OF_WEEK)) {
			return true;
		} else {
			return false;
		}
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}
}

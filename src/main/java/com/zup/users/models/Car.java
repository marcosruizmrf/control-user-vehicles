package com.zup.users.models;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Car {

	
	private int rodizio;
	private Boolean ativo;

	public Car() {
	}

	public int getRodizio() {
		return rodizio;
	}

	public void setRodizio(int rodizio) {
		this.rodizio = rodizio;
	}

	public Boolean getAtivo() {
		return ativo;
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

}

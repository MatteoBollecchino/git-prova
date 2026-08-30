package com.prova.app;

import java.time.LocalDate;

public class Member {

	private String name;
	private String surname;
	private LocalDate birthday;
	private LocalDate expiringDate;

	public Member(String name, String surname, LocalDate birthday, LocalDate expiringDate) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Member name is blanck or null");
		}
		this.name = name.toUpperCase();
		
		if (surname == null || surname.isBlank()) {
			throw new IllegalArgumentException("Member surname is blanck or null");
		}
		this.surname = surname.toUpperCase();
		
		this.birthday = birthday;
		
		this.expiringDate = expiringDate;
	}

	String getName() {
		return this.name;
	}

	String getSurname() {
		return surname;
	}

	LocalDate getBirthday() {
		return birthday;
	}

	LocalDate getExpiringDate() {
		return expiringDate;
	}
	
	

}

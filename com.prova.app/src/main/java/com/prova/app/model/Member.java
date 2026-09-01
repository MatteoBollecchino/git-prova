package com.prova.app.model;

import java.time.LocalDate;

public class Member {

	private String name;
	private String surname;
	private LocalDate birthday;
	private LocalDate expiringDate;
	private Long id;
	
	public Member(String name, String surname, LocalDate birthday, LocalDate expiringDate) {
		checkCredentials(name);
		this.name = name.toUpperCase();
		
		checkCredentials(surname);
		this.surname = surname.toUpperCase();
		
		if(birthday == null) {
			throw new IllegalArgumentException("Birthday parameter cannot be null");
		}
		this.birthday = birthday;
		
		if(expiringDate == null) {
			throw new IllegalArgumentException("Expiring Date has to be valid");
		}
		this.expiringDate = expiringDate;
	}

	private void checkCredentials(String credential) {
		if (credential == null || credential.isBlank()) {
			throw new IllegalArgumentException("Member credential is blank or null");
		}
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

	Long getId() {
		return id;
	}

}

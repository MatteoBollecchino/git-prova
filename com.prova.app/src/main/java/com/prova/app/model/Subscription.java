package com.prova.app.model;

import java.time.LocalDate;

public class Subscription {

	private int months;
	private LocalDate activationDate;
	private Member member;

	public Subscription(int months, LocalDate activationDate, Member member) {
		if (months <= 0) {
			throw new IllegalArgumentException("Months of a Subscription cannot be 0 or negative");
		}
		this.months = months;
		
		if(activationDate == null) {
			throw new IllegalArgumentException("The activation date of the subscription must be a valid one");
		}
		this.activationDate = activationDate;
		
		if(member == null) {
			throw new IllegalArgumentException("The member of the subscription must not be null");
		}
		this.member = member;
		
	}

	int getMonths() {
		return this.months;
	}

	LocalDate getActivationDate() {
		return activationDate;
	}

	Member getMember() {
		return member;
	}

}

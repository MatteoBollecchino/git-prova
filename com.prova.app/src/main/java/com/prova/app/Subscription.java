package com.prova.app;

public class Subscription {

	private int months;
	private boolean active;
	private Member member;

	public Subscription(int months, boolean active, Member member) {
		if (months <= 0) {
			throw new IllegalArgumentException("Months of a Subscription cannot be 0 or negative");
		}
		this.months = months;
		
		this.active = active;
		
		if(member == null) {
			throw new IllegalArgumentException("The member of the subscription must not be null");
		}
		this.member = member;
		
	}

	int getMonths() {
		return this.months;
	}

	boolean isActive() {
		return active;
	}

	Member getMember() {
		return member;
	}

}

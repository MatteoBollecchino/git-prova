package com.prova.app.model;

import static org.assertj.core.api.Assertions.assertThat; 
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;

import org.junit.Test;

public class SubscriptionTest {

	private static Member member = new Member("Matteo", "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1));
	private Subscription sub;
	private LocalDate testActivationDate = LocalDate.of(2026, 9, 10);

	@Test
	public void correctSubscriptionCreationTest() {
		sub = new Subscription(1,testActivationDate , member);
		assertThat(sub.getMonths()).isEqualTo(1);
		assertThat(sub.getActivationDate()).isAfter(LocalDate.now());
		assertThat(sub.getMember()).isEqualTo(member);
	}
	
	@Test
	public void zeroSubscriptionMonthsTest() {
		assertThatThrownBy(
				() -> new Subscription(0, testActivationDate, member))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Months of a Subscription cannot be 0 or negative");
	}
	
	@Test
	public void negativeSubscriptionMonthsTest() {
		assertThatThrownBy(
				() -> new Subscription(-5, testActivationDate, member))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Months of a Subscription cannot be 0 or negative");
	}
	
	@Test
	public void nullSubscriptionMemberTest() {
		assertThatThrownBy(
				() -> new Subscription(5, testActivationDate, null))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("The member of the subscription must not be null");
	}
	
	@Test
	public void nullSubscriptionActivationDateTest() {
		assertThatThrownBy(
				() -> new Subscription(5, null, member))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("The activation date of the subscription must be a valid one");
	}

}

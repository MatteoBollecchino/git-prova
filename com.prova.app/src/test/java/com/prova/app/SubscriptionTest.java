package com.prova.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;

import org.junit.Test;

public class SubscriptionTest {

	private static Member member = new Member("Matteo", "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1));
	private Subscription sub;;

	@Test
	public void correctSubscriptionCreationTest() {
		sub = new Subscription(1, true, member);
		assertThat(sub.getMonths()).isEqualTo(1);
		assertThat(sub.isActive()).isTrue();
		assertThat(sub.getMember()).isEqualTo(member);
	}
	
	@Test
	public void zeroSubscriptionMonthsTest() {
		assertThatThrownBy(
				() -> new Subscription(0, true, member))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Months of a Subscription cannot be 0 or negative");
	}
	
	@Test
	public void negativeSubscriptionMonthsTest() {
		assertThatThrownBy(
				() -> new Subscription(-5, true, member))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Months of a Subscription cannot be 0 or negative");
	}
	
	@Test
	public void nullSubscriptionMemberTest() {
		assertThatThrownBy(
				() -> new Subscription(5, true, null))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("The member of the subscription must not be null");
	}

}

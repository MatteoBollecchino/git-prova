package com.prova.app.model;

import static org.assertj.core.api.Assertions.assertThat; 
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.time.LocalDate;

import org.junit.Test;

public class MemberTest {

	private Member member;

	@Test
	public void correctMemberCreationTest() {
		member = new Member("Matteo", "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1));
		assertThat(member.getName()).isEqualTo("MATTEO");
		assertThat(member.getSurname()).isEqualTo("BOLLECCHINO");
		assertThat(member.getBirthday()).isEqualTo(LocalDate.of(2003, 12, 29));
		assertThat(member.getExpiringDate()).isEqualTo(LocalDate.of(2027, 9, 1));
	}
	
	@Test
	public void blankMemberNameTest() {
		assertThatThrownBy(
				() -> new Member("", "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member credential is blank or null");
	}
	
	@Test
	public void nullMemberNameCreationTest() {
		assertThatThrownBy(
				() -> new Member(null, "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member credential is blank or null");
	}
	
	@Test
	public void blankMemberSurnameTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", "", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member credential is blank or null");
	}
	
	@Test
	public void nullMemberSurnameTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", null, LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member credential is blank or null");
	}
	
	@Test
	public void nullBirthdayTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", "Bollecchino", null, LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Birthday parameter cannot be null");
	}
	
	@Test
	public void nullExpiringDateTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", "Bollecchino", LocalDate.of(2003, 12, 29), null)
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Expiring Date has to be valid");
	}

}

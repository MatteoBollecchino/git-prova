package com.prova.app;

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
	public void blanckMemberNameCreationTest() {
		assertThatThrownBy(
				() -> new Member("", "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member name is blanck or null");
	}
	
	@Test
	public void nullMemberNameCreationTest() {
		assertThatThrownBy(
				() -> new Member(null, "Bollecchino", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member name is blanck or null");
	}
	
	@Test
	public void blanckMemberSurnameCreationTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", "", LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member surname is blanck or null");
	}
	
	@Test
	public void nullMemberSurnameCreationTest() {
		assertThatThrownBy(
				() -> new Member("Matteo", null, LocalDate.of(2003, 12, 29), LocalDate.of(2027, 9, 1))
				)
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("Member surname is blanck or null");
	}

}

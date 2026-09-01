package com.prova.app.repository;

import com.prova.app.model.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
	
	public void createNewMember();
	
	// Is it the correct choice to return an optional?
	public Optional<Member> findMemberById(Long id);
	
	public List<Member> findAllMembers();
	
	public void deleteMemberById(Long id);
	
	public void clear();

}

package com.prova.app.repository;

import com.prova.app.model.Member;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository {
	
	void save(Member member);
	
	Optional<Member> findById(UUID id);
	
	List<Member> findAll();
	
	void deleteById(UUID id);
	
	void clear();

}

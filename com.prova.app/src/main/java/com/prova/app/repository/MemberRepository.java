package com.prova.app.repository;

import com.prova.app.model.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
	
	void save(Member member);
	
	Optional<Member> findById(Long id);
	
	List<Member> findAll();
	
	void deleteById(Long id);
	
	void clear();

}

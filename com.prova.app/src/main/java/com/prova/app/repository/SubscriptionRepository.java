package com.prova.app.repository;

import com.prova.app.model.Subscription; 
import java.util.List;
import java.util.Optional;

public interface SubscriptionRepository {
	
	void save(Subscription subscription);
	
	Optional<Subscription> findById(Long id);
	
	List<Subscription> findAll();
	
	void deleteById(Long id);
	
	void clear();

}

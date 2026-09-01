package com.prova.app.repository;

import com.prova.app.model.Subscription; 
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SubscriptionRepository {
	
	void save(Subscription subscription);
	
	Optional<Subscription> findById(UUID id);
	
	List<Subscription> findAll();
	
	void deleteById(UUID id);
	
	void clear();

}

package com.prova.app.repository;

import com.prova.app.model.Subscription; 
import java.util.List;
import java.util.Optional;

public interface SubscriptionRepository {
	
	public void createNewSubscription();
	
	// Is it the correct choice to return an optional?
	public Optional<Subscription> findSubscriptionById(Long id);
	
	public List<Subscription> findAllSubscriptions();
	
	public void deleteSubscriptionById(Long id);
	
	public void clear();

}

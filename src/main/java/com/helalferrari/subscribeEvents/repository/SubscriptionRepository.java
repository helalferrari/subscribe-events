package com.helalferrari.subscribeEvents.repository;

import com.helalferrari.subscribeEvents.model.Session;
import com.helalferrari.subscribeEvents.model.Subscription;
import com.helalferrari.subscribeEvents.model.SubscriptionID;
import com.helalferrari.subscribeEvents.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}

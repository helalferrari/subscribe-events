package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.model.Session;
import com.helalferrari.subscribeEvents.model.Subscription;
import com.helalferrari.subscribeEvents.model.User;
import com.helalferrari.subscribeEvents.repository.ConferenceRepository;
import com.helalferrari.subscribeEvents.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private SubscriptionRepository repository;

    public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.repository = subscriptionRepository;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreatedAt(LocalDateTime.now());
        subscription.setUniqueID(UUID.randomUUID().toString());
        return repository.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return repository.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return repository.findByIdSession(session);
    }
}

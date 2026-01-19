package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.model.Session;
import com.helalferrari.subscribeEvents.model.Subscription;
import com.helalferrari.subscribeEvents.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}

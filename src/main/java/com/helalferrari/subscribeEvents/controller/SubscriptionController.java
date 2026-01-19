package com.helalferrari.subscribeEvents.controller;

import com.helalferrari.subscribeEvents.model.Session;
import com.helalferrari.subscribeEvents.model.Subscription;
import com.helalferrari.subscribeEvents.model.User;
import com.helalferrari.subscribeEvents.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {
    private final ISubscriptionService subscriptionService;

    public SubscriptionController(ISubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(subscriptionService.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{Id}")
    public ResponseEntity<List<Subscription>> getByUserId(@PathVariable Integer Id) {
        User user = new User();
        user.setId(Id);
        return ResponseEntity.ok(subscriptionService.getAllByUser(user));
    }

    @GetMapping("/subscriptions/session/{Id}")
    public ResponseEntity<List<Subscription>> getBySession(@PathVariable Integer Id) {
        Session session = new Session();
        session.setId(Id);
        return ResponseEntity.ok(subscriptionService.getAllBySession(session));
    }
}

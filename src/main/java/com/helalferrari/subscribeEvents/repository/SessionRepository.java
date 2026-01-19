package com.helalferrari.subscribeEvents.repository;

import com.helalferrari.subscribeEvents.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {
}

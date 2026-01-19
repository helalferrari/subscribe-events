package com.helalferrari.subscribeEvents.repository;

import com.helalferrari.subscribeEvents.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {
}

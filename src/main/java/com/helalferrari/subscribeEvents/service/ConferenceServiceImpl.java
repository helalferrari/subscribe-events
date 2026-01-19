package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.exception.NotFoundException;
import com.helalferrari.subscribeEvents.model.Conference;
import com.helalferrari.subscribeEvents.repository.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceService {

    private ConferenceRepository repo;

    public ConferenceServiceImpl(ConferenceRepository repo) {
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Conference " + id + " not found."));
    }

    @Override
    public List<Conference> getAllConferences() {
        return repo.findAll();
    }
}
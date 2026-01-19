package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.model.Conference;

import java.util.List;

public interface IConferenceService {
    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}

package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.model.Session;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Integer id);
    public List<Session> getAllSessions();
}

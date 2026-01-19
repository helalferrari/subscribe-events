package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.exception.NotFoundException;
import com.helalferrari.subscribeEvents.model.Session;
import com.helalferrari.subscribeEvents.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService{

    private SessionRepository repo;

    public SessionServiceImpl(SessionRepository repo) {
        this.repo = repo;
    }

    @Override
    public Session addSession(Session session) {
        return repo.save(session);
    }

    @Override
    public Session getSessionById(Integer id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Session " + id +" not found"));
    }

    @Override
    public List<Session> getAllSessions() {
        return repo.findAll();
    }
}

package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.exception.NotFoundException;
import com.helalferrari.subscribeEvents.model.User;
import com.helalferrari.subscribeEvents.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    private UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("User " + id + " not found"));
    }

    @Override
    public User getUserByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(()-> new NotFoundException("User " + email + " not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}

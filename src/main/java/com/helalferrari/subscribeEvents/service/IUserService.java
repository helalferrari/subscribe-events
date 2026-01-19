package com.helalferrari.subscribeEvents.service;

import com.helalferrari.subscribeEvents.model.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public User getUserById(Integer id);
    public User getUserByEmail(String email);
    public List<User> getAllUsers();
}

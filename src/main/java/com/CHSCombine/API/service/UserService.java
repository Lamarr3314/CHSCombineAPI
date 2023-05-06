package com.CHSCombine.API.service;

import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(int id) {
        return repository.findById(id).orElseThrow();
    }

    public User getUserByName(String name) {
        return repository.findByName(name);
    }

    //TODO implement additional methods to get if based on gender and score
    //TODO think of maybe making only one service, that may allow to create a way to add a game to a user
//    @Query()
}

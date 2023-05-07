package com.CHSCombine.API.service;

import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.*;

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

    public User getUserById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<User> getUsersById(List<Integer> id) {
        List<User> list = new ArrayList<>();
        for(Integer i: id){
            list.add(repository.findById(i).orElseThrow());
        }
        return list;
    }

    public List<User> filterLeaders(String gender, String name){
        return repository.filterLeaders(gender, name);
    }

    public List<User> filterLeaderGender(String gender){return repository.filterLeaderGender(gender);}
    public String getNameById(Integer id){return repository.findById(id).orElseThrow().getName();}

    public User getUserByName(String name) {
        return repository.findByName(name);
    }

    public void tallyUserScores(){
        repository.tallyUserScores();
    }


}

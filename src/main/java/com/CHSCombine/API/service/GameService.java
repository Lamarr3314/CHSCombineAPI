package com.CHSCombine.API.service;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.repository.GameRepository;
import com.CHSCombine.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;
    private UserService userService;

    public Game saveGame(Game game) {
        return repository.save(game);
    }

    public List<Game> saveUsers(List<Game> game) {
        return repository.saveAll(game);
    }

    public List<Game> getGames() {
        return repository.findAll();
    }

    public Game getGameById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Game> getGameByUserId(Integer id) {
        return repository.getGameByUserId(id);
    }

    public Integer getGameCount(Integer id, String event) {
        return repository.getGameCount(id, event);
    }

    public Game getGameByName(String name) {
        return repository.findByName(name);
    }


    //TODO implement additional methods to get if based on gender and score
//    @Query()
}

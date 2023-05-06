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

    public Game saveGame(Game game) {
        return repository.save(game);
    }

    public List<Game> saveUsers(List<Game> game) {
        return repository.saveAll(game);
    }

    public List<Game> getGames(){
        return repository.findAll();
    }

    public Game getGameById(int id){
        return repository.findById(id).orElseThrow();
    }

    public Game getGameByName(String name){
        return repository.findByName(name);
    }

    //TODO implement additional methods to get if based on gender and score
//    @Query()
}

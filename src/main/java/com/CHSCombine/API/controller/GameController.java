package com.CHSCombine.API.controller;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.service.GameService;
import com.CHSCombine.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameService service;


    @PostMapping("/addGame/{id}")
    public Game addProduct(@RequestBody Game game) {
        return service.saveGame(game);
    }

    @GetMapping("/games")
    public List<Game> findAllProducts() {
        return service.getGames();
    }

    @GetMapping("/gameById/{id}")
    public Game findProductById(@PathVariable int id) {
        return service.getGameById(id);
    }


    @GetMapping("/game/{name}")
    public Game findProductByName(@PathVariable String name) {
        return service.getGameByName(name);
    }



}

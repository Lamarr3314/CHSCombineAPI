package com.CHSCombine.API.controller;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.service.GameService;
import com.CHSCombine.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class GameController {
    @Autowired
    private GameService service;
    @CrossOrigin(origins = "http://localhost:5500")


    @PostMapping("/addGame")
    public Game addProduct(@RequestBody Game game) {
        return service.saveGame(game);
    }

    @GetMapping("/games")
    public List<Game> findAllProducts() {
        return service.getGames();
    }

    @GetMapping("/gameById/{id}")
    public Game findProductById(@PathVariable Integer id) {
        return service.getGameById(id);
    }

    @GetMapping("/gameByUserId/{id}")
    public List<Game> findGamesByUserId(@PathVariable Integer id) {
        return service.getGameByUserId(id);
    }

    @GetMapping("/gameCount/{id}/{event}")
    public Integer gameCount(@PathVariable Integer id, @PathVariable String event) {
        return service.getGameCount(id, event);
    }


    @GetMapping("/game/{name}")
    public Game findProductByName(@PathVariable String name) {
        return service.getGameByName(name);
    }

    @GetMapping("/filterLeaders/{gender}/{event}")
    public List<Game> findProductById(@PathVariable String gender, @PathVariable String event) {
        return service.filterLeaders(gender, event);
    }

}

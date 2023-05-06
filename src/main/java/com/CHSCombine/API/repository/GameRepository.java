package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByName(String name);
}

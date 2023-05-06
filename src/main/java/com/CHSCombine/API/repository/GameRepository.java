package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByName(String name);
}

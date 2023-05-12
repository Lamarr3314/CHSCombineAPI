package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByName(String name);

    @Modifying
    @Query(value = "SELECT id, name, entry_time, score, measure, user_id\n" +
            "FROM game_table\n" +
            "Where user_id = :id\n",
            nativeQuery = true)
    List<Game> getGameByUserId(@Param("id") Integer id);

    @Modifying
    @Query(value = "SELECT gt.id, ut.gender, ut.name, gt.score, gt.measure, gt.entry_time, ut.id AS user_id\n" +
            "FROM user_table ut\n" +
            "LEFT JOIN game_table gt ON ut.id = gt.user_id\n" +
            "WHERE ut.gender = :gender AND gt.name = :event\n" +
            "ORDER BY gt.score DESC", nativeQuery = true)
    List<Game> filterLeaders(@Param("gender") String gender, @Param("event") String event);


    @Query(value = "SELECT COUNT(*)\n" +
            "FROM game_table\n" +
            "WHERE user_id = :id AND name = :event",
            nativeQuery = true)
    Integer getGameCount(@Param("id") Integer id, @Param("event") String event);
}

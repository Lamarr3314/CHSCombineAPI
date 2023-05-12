package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);

    @Procedure("sum_user_scores")
    void tallyUserScores();



    @Modifying
    @Query(value = "SELECT id, gender, name, score\n" +
            "FROM user_table \n" +
            "WHERE gender = :gender\n" +
            "ORDER BY score DESC", nativeQuery = true)
    List<User> filterLeaderGender(@Param("gender") String gender);
}

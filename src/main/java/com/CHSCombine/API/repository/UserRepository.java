package com.CHSCombine.API.repository;

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
    @Query(value = "SELECT ut.id, ut.gender, ut.name, gt.score\n" +
            "FROM user_table ut\n" +
            "LEFT JOIN game_table gt ON ut.id = gt.user_id\n" +
            "WHERE ut.gender = :gender AND gt.name = :event\n" +
            "ORDER BY gt.score DESC", nativeQuery = true)
    List<User> filterLeaders(@Param("gender") String gender, @Param("event") String event);
}

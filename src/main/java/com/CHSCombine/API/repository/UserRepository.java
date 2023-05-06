package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);

//    @Query(value = "call sum_user_scores();", nativeQuery = true)
//    void tallyUserScores();

    @Procedure("sum_user_scores")
    void tallyUserScores();
}

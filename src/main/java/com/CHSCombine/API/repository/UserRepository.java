package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.CHSCombine.API.repository;

import com.CHSCombine.API.entity.Game;
import com.CHSCombine.API.entity.PermissionSlip;
import com.CHSCombine.API.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionSlipRepository extends JpaRepository<PermissionSlip, Integer> {

    @Modifying
    @Query(value="SELECT id, child_name, student_name, student_id, student_signature, parent_name, parent_signature, date_signed, phone_1, address_1, phone_2, address_2, user_id\n"+
    "FROM permission_slip_table\n"+
    "WHERE user_id = :userId", nativeQuery = true)
    public List<PermissionSlip> permissionSlipByUser(@Param("userId") Integer userId);

    @Procedure(value ="sum_user_slips")
    public void tallyPermissionSlips();
}
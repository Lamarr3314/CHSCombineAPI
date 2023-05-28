package com.CHSCombine.API.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permission_slip_table")
public class PermissionSlip {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_slip_seq")
    @SequenceGenerator(name = "permission_slip_seq", sequenceName = "permission_slip_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "child_name")
    private String child_name;
    @Column(name = "student_name")
    private String student_name;
    @Column(name = "student_id")
    private String student_id;
    @Column(name = "student_signature")
    private String student_signature;
    @Column(name = "parent_name")
    private String parent_name;
    @Column(name = "parent_signature")
    private String parent_signature;
    @Column(name = "date_signed")
    private String date_signed;
    @Column(name = "phone_1")
    private String phone_1;
    @Column(name = "address_1")
    private String address_1;
    @Column(name = "phone_2")
    private String phone_2;
    @Column(name = "address_2")
    private String address_2;
    @Column(name = "user_id")
    private int user_id;


}
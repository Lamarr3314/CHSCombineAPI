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
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;
    private String gender;

    public int getId(){
        return id;
    }


}

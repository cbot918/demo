package com.example.demo.memeber.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="password", nullable = false)
    private String password;
}

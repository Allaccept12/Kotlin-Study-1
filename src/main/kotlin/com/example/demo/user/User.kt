package com.example.demo.user

import javax.persistence.*

@Entity

class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long,

    @Column(name = "user_name", nullable = false)
    val name: String
    )
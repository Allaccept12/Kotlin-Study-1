package com.example.demo.user

import javax.persistence.*

@Entity

class User (
    _name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long = 0

    @Column(name = "user_name", nullable = false)
    var name: String = _name
        protected set
}
package com.example.demo.board

import com.example.demo.user.User
import javax.persistence.*


@Entity
class Board (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    val id: Long,

    @Column(name = "description", nullable = false)
    val desc: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val User: User,
)

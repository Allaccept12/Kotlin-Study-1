package com.example.demo.board

import com.example.demo.user.User
import javax.persistence.*


@Entity
class Board (
    _desc:String,
    _user:User
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    val id: Long = 0

    @Column(name = "description", nullable = false)
    var desc: String = _desc
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User = _user
        protected set

}
package com.example.demo.comment

import com.example.demo.board.Board
import com.example.demo.user.User
import javax.persistence.*


@Entity
class Comment (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    val id: Long,

    @Column(name = "description", nullable = false)
    val desc: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    val board: Board,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_comment_id", nullable = false)
    val parentComment: Comment? = null,

    @OneToMany(mappedBy = "parentComment", cascade = [CascadeType.ALL])
    val childComment: MutableList<Comment>? = ArrayList()
    ){

}
package com.example.demo.comment

import com.example.demo.board.Board
import com.example.demo.user.User
import javax.persistence.*


@Entity
class Comment(
    _desc: String,
    _depth: Int,
    _board: Board,
    _user: User,
    _parentComment: Comment?
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    val id: Long = 0

    @Column(name = "description", nullable = false)
    var desc: String = _desc

    @Column(nullable = false)
    var depth: Int = _depth
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    val board: Board = _board

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User = _user

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prent_comment_id")
    var parentComment: Comment? = _parentComment
        protected set

    @OneToMany(mappedBy = "parentComment", cascade = [CascadeType.ALL])
    protected val mutableChildComment: MutableList<Comment> = mutableListOf()
    val childComment: List<Comment> get() = mutableChildComment.toList()

}

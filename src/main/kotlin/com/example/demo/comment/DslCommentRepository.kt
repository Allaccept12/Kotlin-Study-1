package com.example.demo.comment

interface DslCommentRepository {
    fun getAllComments(boardId:Long): List<Comment>
    fun getOneCommentWithSubComment(boardId: Long, parentCommentId: Long)
}
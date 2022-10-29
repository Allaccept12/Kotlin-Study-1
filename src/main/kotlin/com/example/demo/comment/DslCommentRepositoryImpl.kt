package com.example.demo.comment

import com.example.demo.comment.QComment.comment
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory


class DslCommentRepositoryImpl (
    var queryFactory: JPAQueryFactory
    ): DslCommentRepository {



    override fun getAllComments(boardId: Long): List<Comment> {
        queryFactory
            .select(
                Projections.constructor()
            )
            .from(comment)

    }

    override fun getOneCommentWithSubComment(boardId: Long, parentCommentId: Long) {
        TODO("Not yet implemented")
    }
}
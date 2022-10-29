package com.example.demo.comment

import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository: JpaRepository<Comment,Long>, DslCommentRepository {
}
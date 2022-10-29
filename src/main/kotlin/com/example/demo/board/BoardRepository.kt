package com.example.demo.board

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<Board,Long> {
}
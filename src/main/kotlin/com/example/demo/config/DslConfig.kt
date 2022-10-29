package com.example.demo.config

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@Configuration
class DslConfig(@PersistenceContext val em: EntityManager) {

    @Bean
    fun jpaQueryFactory(): JPAQueryFactory{
        return JPAQueryFactory(em)
    }
}
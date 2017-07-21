package com.example.demo.domain


import org.springframework.data.repository.Repository


interface UserRepository : Repository<User, Long> {

    fun findByEmail(email: String): List<User>

}
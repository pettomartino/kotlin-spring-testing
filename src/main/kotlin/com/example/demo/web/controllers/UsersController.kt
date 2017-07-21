package com.example.demo.web.controllers

import com.example.demo.domain.User
import com.example.demo.domain.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody


@Controller
@RequestMapping("/users")
class UsersController(val repository: UserRepository) {

    @GetMapping("/find")
    @ResponseBody
    fun listUsers(@RequestParam("email") email: String): List<User?> = repository.findByEmail(email)
}
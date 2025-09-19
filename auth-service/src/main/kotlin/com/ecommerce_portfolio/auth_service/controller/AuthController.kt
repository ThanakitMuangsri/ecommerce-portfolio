package com.ecommerce_portfolio.auth_service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController {
    @GetMapping("/ping")
    fun ping(): String {
        return "Auth Service is running with Kotlin!!"
    }
}
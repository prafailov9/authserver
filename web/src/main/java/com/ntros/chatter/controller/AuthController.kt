package com.ntros.chatter.controller;

import com.ntros.chatter.auth.AuthService
import com.ntros.chatter.model.UserDTO
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid

@RestController
@RequestMapping("/api/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/register")
    fun registerUser(@RequestBody @Valid userDTO: UserDTO):ResponseEntity<String>

    {
        authService.registerUser(userDTO)
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.")
    }
}

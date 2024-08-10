package com.ntros.chatter.dto

import jakarta.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val email: String,
    val password: String,
    @ElementCollection(fetch = FetchType.EAGER)
    val roles: Set<Role>
)

enum class Role {
    USER, ADMIN
}

data class UserDTO(
    @field:Email
    val email: String,
    @field:NotBlank
    val password: String
)

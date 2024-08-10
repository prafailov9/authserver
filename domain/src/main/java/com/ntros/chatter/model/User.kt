package com.ntros.chatter.model

import jakarta.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val email: String,
    val password: String,
    @ElementCollection(fetch = FetchType.EAGER)
    val roles: Set<Role>
)


data class UserDTO(
    @field:Email
    val email: String,
    @field:NotBlank
    val password: String,
    val roles: Set<Role>
)

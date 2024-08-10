package com.ntros.chatter.model


import jakarta.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
data class Role(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val roleName: String
)

data class RoleDTO(
    val roleName: String
)
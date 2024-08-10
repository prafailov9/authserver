package com.ntros.chatter.auth

import com.ntros.chatter.dto.UserDTO

interface AuthService {

    fun registerUser(userDto: UserDTO)

}
package com.ntros.chatter.auth

import com.ntros.chatter.model.UserDTO

interface AuthService {

    fun registerUser(userDto: UserDTO)

}
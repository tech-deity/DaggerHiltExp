package com.example.daggerhiltexp.network

import com.example.daggerhiltexp.models.User
import javax.inject.Inject

class UserServiceImp
@Inject
constructor(private val userServiceImp: UserServiceImp) {

    suspend fun getUser():List<User> = userServiceImp.getUser()
}
// now we have to provide dependency of interface for that we need to create module
//lets create container package

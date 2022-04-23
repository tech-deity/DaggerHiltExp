package com.example.daggerhiltexp.repository

import com.example.daggerhiltexp.models.User
import com.example.daggerhiltexp.network.UserServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class UserRepo @Inject constructor(private val userServiceImp: UserServiceImp) {
 fun getUser() : Flow<List<User>> = flow{
     val response = userServiceImp.getUser()
     emit(response)

 }.flowOn(Dispatchers.IO)
    
}
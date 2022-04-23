package com.example.daggerhiltexp.network

import com.example.daggerhiltexp.models.User
import retrofit2.http.GET

interface UserService {
    @GET("fetchuser.php")
    suspend fun getUser():List<User>
}
//now we have to create the implementation of this interface lets create an class UserServiceImp
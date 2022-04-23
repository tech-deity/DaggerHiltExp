package com.example.daggerhiltexp.di


import com.example.daggerhiltexp.network.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    //dependency for base URL
    @Provides
    fun provideBaseURL():String="https://gwebapi.000webhostapp.com/"

    @Provides
    @Singleton
    fun providerRetrofitBuilder(baseUrl:String):Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideUserService(retrofit: Retrofit):UserService=retrofit.create(UserService::class.java)
}

package com.npe.galaxyorganic.ui.model.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiRespository{
    val base_url = "http://192.168.1.41/stock/public/api/"

    fun create() : ApiService{
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(base_url)
            .build()
        return retrofit.create(ApiService::class.java)
    }
}
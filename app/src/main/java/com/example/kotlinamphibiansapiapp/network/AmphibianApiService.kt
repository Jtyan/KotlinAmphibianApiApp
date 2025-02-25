package com.example.kotlinamphibiansapiapp.network

import com.example.kotlinamphibiansapiapp.model.AmphibianModel
import retrofit2.http.GET

interface AmphibianApiService {

    @GET("amphibians")
    suspend fun getAmphibians(): List<AmphibianModel>
}
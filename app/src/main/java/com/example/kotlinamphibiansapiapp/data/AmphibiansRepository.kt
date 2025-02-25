package com.example.kotlinamphibiansapiapp.data

import com.example.kotlinamphibiansapiapp.model.AmphibianModel
import com.example.kotlinamphibiansapiapp.network.AmphibianApiService

interface AmphibiansRepository {
    suspend fun getAmphibians() : List<AmphibianModel>
}

class NetworkAmphibiansRepository(
    private val amphibianApiService: AmphibianApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<AmphibianModel> {
        return amphibianApiService.getAmphibians()
    }
}
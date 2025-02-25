package com.example.kotlinamphibiansapiapp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import java.util.UUID

@Serializable
data class AmphibianModel(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val type: String,
    val description: String,
    @SerialName(value = "img_src")
    val imgSrc: String
    )

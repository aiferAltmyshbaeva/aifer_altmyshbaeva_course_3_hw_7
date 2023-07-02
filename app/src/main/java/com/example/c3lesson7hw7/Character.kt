package com.example.c3lesson7hw7

import java.io.Serializable

data class Character(
    val image: String? = "No image available",
    val status: String? = "Unknown status",
    val name: String? = "Unknown name",
    val index: Int
): Serializable

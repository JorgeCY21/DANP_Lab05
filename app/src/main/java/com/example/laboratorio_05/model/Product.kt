package com.example.laboratorio_05.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val longDescription: String,
    val price: Double,
    val category: String,
    val imageUrl: String
)
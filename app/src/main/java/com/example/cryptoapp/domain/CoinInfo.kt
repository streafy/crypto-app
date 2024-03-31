package com.example.cryptoapp.domain

data class CoinInfo(
    val price: String,
    val minPrice: String,
    val maxPrice: String,
    val lastMarket: String,
    val lastUpdate: String,
    val fromSymbol: String,
    val toSymbol: String,
    val imageUrl: String,
)
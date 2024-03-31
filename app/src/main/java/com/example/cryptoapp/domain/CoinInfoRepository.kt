package com.example.cryptoapp.domain

import kotlinx.coroutines.flow.Flow

interface CoinInfoRepository {

    fun getCoinInfoList(): Flow<List<CoinInfo>>

    fun getCoinInfo(fromSymbol: String): Flow<CoinInfo>
}
package com.example.cryptoapp.domain.usecases

import com.example.cryptoapp.domain.CoinInfo
import com.example.cryptoapp.domain.CoinInfoRepository
import kotlinx.coroutines.flow.Flow

class GetCoinInfoUseCase(repository: CoinInfoRepository) :
        (String) -> Flow<CoinInfo> by repository::getCoinInfo
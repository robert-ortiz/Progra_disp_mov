package com.calyrsoft.ucbp1.features.dollar.data.repository

import com.calyrsoft.ucbp1.features.dollar.domain.model.DollarModel
import com.calyrsoft.ucbp1.features.dollar.domain.repository.IDollarRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DollarRepository: IDollarRepository {

    override suspend fun getDollar(): Flow<DollarModel> {
        return flow {
            emit(DollarModel("123", "456"))
        }
    }
}
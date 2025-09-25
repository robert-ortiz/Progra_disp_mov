package com.calyrsoft.ucbp1.features.dollar.domain.model

data class DollarModel(
    var dollarOfficial: String? = null,
    var dollarParallel: String? = null,

    var dollarUSDT: String? = null,
    var dollarUSDC: String? = null,
    var timestamp: Long = 0
)
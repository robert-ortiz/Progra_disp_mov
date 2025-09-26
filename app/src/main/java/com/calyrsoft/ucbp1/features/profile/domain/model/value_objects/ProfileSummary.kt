package com.calyrsoft.ucbp1.features.profile.domain.model.value_objects

data class ProfileSummary(val value: String) {
    init {
        require(value.length <= 500) { "El resumen excede el límite de 500 caracteres." }
    }
}
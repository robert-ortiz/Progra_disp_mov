package com.calyrsoft.ucbp1.features.profile.domain.model.value_objects

data class ProfileName(val value: String) {
    init {
        require(value.isNotBlank()) { "El nombre no puede estar vacío." }
        require(value.length in 2..50) { "El nombre debe tener entre 2 y 50 caracteres." }
    }
}
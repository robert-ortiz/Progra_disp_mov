package com.calyrsoft.ucbp1.features.profile.domain.model.value_objects

data class ProfilePathUrl(val value: String) {
    init {
        require(value.isNotBlank()) { "La URL de la imagen de perfil no puede estar vacía." }
    }
}
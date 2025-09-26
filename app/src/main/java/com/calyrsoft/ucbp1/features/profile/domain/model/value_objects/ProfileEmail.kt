package com.calyrsoft.ucbp1.features.profile.domain.model.value_objects

data class ProfileEmail(val value: String) {
    init {
        val emailRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$")
        require(value.isNotBlank() && value.matches(emailRegex)) {
            "Formato de correo electrónico inválido."
        }
    }
}
package com.calyrsoft.ucbp1.features.profile.domain.model.value_objects

data class ProfileCellphone(val value: String) {
    init {
        val cleanValue = value.replace("[^0-9]".toRegex(), "")
        require(cleanValue.length in 8..15) { "Número de teléfono inválido." }
    }

    fun toDisplayFormat(): String {
        val cleanValue = value.replace("[^0-9]".toRegex(), "")
        if (cleanValue.length == 10) {
            return "(${cleanValue.substring(0, 3)}) ${cleanValue.substring(3, 6)}-${cleanValue.substring(6)}"
        }
        return value
    }
}
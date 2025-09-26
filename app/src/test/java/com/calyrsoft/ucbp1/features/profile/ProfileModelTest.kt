package com.calyrsoft.ucbp1.features.profile.domain.model

import org.junit.Test
import org.junit.Assert.*
import org.junit.Assert.assertThrows

import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfilePathUrl
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileName
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileEmail
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileCellphone
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileSummary

class ProfileModelTest {


    @Test
    fun `ProfileModel is created correctly with valid value objects`() {
        val validPathUrl = "https://example.com/pic.jpg"
        val validName = "Homer J. Simpson"
        val validEmail = "homero.j.simpson@springfield.edu"
        val validCellphone = "7777888899"
        val validSummary = "Doblado de Springfield."

        val pathUrl = ProfilePathUrl(validPathUrl)
        val name = ProfileName(validName)
        val email = ProfileEmail(validEmail)
        val cellphone = ProfileCellphone(validCellphone)
        val summary = ProfileSummary(validSummary)

        // 2. Creamos el ProfileModel usando los VOs
        val profile = ProfileModel(
            pathUrl = pathUrl,
            name = name,
            email = email,
            cellphone = cellphone,
            summary = summary
        )

        // 3. Verificamos que los valores internos se hayan guardado correctamente
        assertEquals(validName, profile.name.value)
        assertEquals(validEmail, profile.email.value)
        assertEquals(validCellphone, profile.cellphone.value)
        assertEquals(validPathUrl, profile.pathUrl.value)
    }

    // --- TESTS ESPECÍFICOS DE VALIDACIÓN DE VALUE OBJECTS ---

    @Test
    fun `ProfileName throws exception for blank value`() {
        assertThrows(IllegalArgumentException::class.java) {
            ProfileName("   ") // Nombre vacío o solo espacios
        }
    }

    @Test
    fun `ProfileEmail throws exception for invalid format`() {
        assertThrows(IllegalArgumentException::class.java) {
            ProfileEmail("invalid-email.com") // Le falta el '@'
        }
    }

    @Test
    fun `ProfileCellphone throws exception for short length`() {
        // Asumiendo que tu regla requiere al menos 8 dígitos
        assertThrows(IllegalArgumentException::class.java) {
            ProfileCellphone("12345")
        }
    }

    @Test
    fun `ProfileCellphone is created correctly and formats value`() {
        val rawNumber = "1234567890"
        val cellphone = ProfileCellphone(rawNumber)

        // Verifica el valor crudo
        assertEquals(rawNumber, cellphone.value)

        // Verifica el formato de presentación
        assertEquals("(123) 456-7890", cellphone.toDisplayFormat())
    }

    @Test
    fun `ProfileSummary is created correctly with maximum length`() {
        // Creamos un string de 500 caracteres (asumiendo tu límite de 500)
        val longSummary = "A".repeat(500)
        val summary = ProfileSummary(longSummary)
        assertEquals(longSummary, summary.value)
    }

    @Test
    fun `ProfileSummary throws exception for exceeding maximum length`() {
        // Intentamos crear un resumen de 501 caracteres
        val tooLongSummary = "B".repeat(501)
        assertThrows(IllegalArgumentException::class.java) {
            ProfileSummary(tooLongSummary)
        }
    }
}
package com.calyrsoft.ucbp1.features.profile.data.repository

import com.calyrsoft.ucbp1.features.profile.domain.model.ProfileModel
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileCellphone
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileEmail
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileName
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfilePathUrl
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileSummary
import com.calyrsoft.ucbp1.features.profile.domain.repository.IProfileRepository

class ProfileRepository: IProfileRepository {
    override fun fetchData(): Result<ProfileModel> {
        return Result.success(
            ProfileModel(
              pathUrl = ProfilePathUrl("https://vignette.wikia.nocookie.net/toplistas/images/f/f3/Homer_Simpson.jpg/revision/latest/scale-to-width-down/350?cb=20150921035255&path-prefix=es"),

              name = ProfileName("Homer J. Simpson"),
                 email = ProfileEmail("homero.j.simpson@springfield.edu"),

               cellphone = ProfileCellphone("+1 (555) 555-7422"),

                summary = ProfileSummary("Doblado de Springfield y dedicado inspector de seguridad en la Planta Nuclear.")
            )
        )
    }
}
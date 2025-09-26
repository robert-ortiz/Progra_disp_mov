package com.calyrsoft.ucbp1.features.profile.domain.model

import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfilePathUrl
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileName
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileEmail
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileCellphone
import com.calyrsoft.ucbp1.features.profile.domain.model.value_objects.ProfileSummary

data class ProfileModel(
    val pathUrl: ProfilePathUrl,
    val name: ProfileName,
    val email: ProfileEmail,
    val cellphone: ProfileCellphone,
    val summary: ProfileSummary
)
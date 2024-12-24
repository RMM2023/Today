package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ActorDirectorResponse

data class ActorDirectorData(
    val staffId: Int,
    val nameRu: String,
    val nameEn: String,
    val description: String,
    val posterUrl: String,
    val professionText: String,
    val professionKey: String
)
fun ActorDirectorData.toData() : ActorDirectorResponse{
    return ActorDirectorResponse(
        this.staffId,
        this.nameRu,
        this.nameEn,
        this.description,
        this.posterUrl,
        this.professionText,
        this.professionKey
    )
}
fun ActorDirectorResponse.toDomain() : ActorDirectorData{
    return ActorDirectorData(
        this.staffId,
        this.nameRu,
        this.nameEn,
        this.description,
        this.posterUrl,
        this.professionText,
        this.professionKey
    )
}

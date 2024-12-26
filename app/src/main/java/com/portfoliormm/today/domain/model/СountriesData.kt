package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Сountries

data class СountriesData(
    val id: Int,
    val country: String
)
fun СountriesData.toData() : Сountries{
    return Сountries(
        this.id,
        this.country
    )
}
fun Сountries.toDomain() : СountriesData{
    return СountriesData(
        this.id,
        this.country
    )
}
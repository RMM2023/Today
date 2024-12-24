package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Genres
import com.portfoliormm.today.data.model.ItemsPremiere
import com.portfoliormm.today.data.model.Сountries

data class ItemsPremiereData(
    val kinopoiskId: Int,
    val nameRu: String,
    val nameEn: String,
    val year: Int,
    val posterUrl: String,
    val posterUrlPreview: String,
    val countries: List<Сountries>,
    val genres: List<Genres>,
    val duration: Int,
    val premiereRu: String
)
fun ItemsPremiereData.toData() : ItemsPremiere{
    return ItemsPremiere(
        this.kinopoiskId,
        this.nameRu,
        this.nameEn,
        this.year,
        this.posterUrl,
        this.posterUrlPreview,
        this.countries,
        this.genres,
        this.duration,
        this.premiereRu
    )
}
fun ItemsPremiere.toDomain() : ItemsPremiereData{
    return ItemsPremiereData(
        this.kinopoiskId,
        this.nameRu,
        this.nameEn,
        this.year,
        this.posterUrl,
        this.posterUrlPreview,
        this.countries,
        this.genres,
        this.duration,
        this.premiereRu
    )
}

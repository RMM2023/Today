package com.portfoliormm.today.data.model

data class ItemsPremiere(
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

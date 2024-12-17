package com.portfoliormm.today.data.model.dataclass

data class Films(
    val filmId: Int,
    val nameRu: String,
    val nameEn: String,
    val type: String,
    val year: String,
    val description: String,
    val filmLength: String,
    val country: List<Сountries>,
    val genre: List<Genres>,
    val rating: String,
    val ratingVoteCount: Int,
    val posterUrl: String,
    val posterUrlPreview: String
)

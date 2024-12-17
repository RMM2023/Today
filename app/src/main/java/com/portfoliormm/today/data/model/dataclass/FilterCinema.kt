package com.portfoliormm.today.data.model.dataclass

data class FilterCinema(
    val total: Int,
    val totalPages: Int,
    val items: List<BaseCinemaData>,
    val ratingKinopoisk: List<BaseCinemaData>,
    val ratingImdb: Int,
    val year: Int,
    val type: String,
    val posterUrl: String,
    val posterUrlPreview: String
)

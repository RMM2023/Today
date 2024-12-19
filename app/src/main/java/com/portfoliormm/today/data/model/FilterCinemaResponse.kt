package com.portfoliormm.today.data.model

data class FilterCinemaResponse(
    val total: Int,
    val totalPages: Int,
    val items: List<BaseCinemaResponse>,
    val ratingKinopoisk: List<BaseCinemaResponse>,
    val ratingImdb: Int,
    val year: Int,
    val type: String,
    val posterUrl: String,
    val posterUrlPreview: String
)

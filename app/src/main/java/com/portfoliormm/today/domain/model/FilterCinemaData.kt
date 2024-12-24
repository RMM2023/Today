package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.BaseCinemaResponse
import com.portfoliormm.today.data.model.FilterCinemaResponse

data class FilterCinemaData(
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
fun FilterCinemaData.toData() : FilterCinemaResponse{
    return FilterCinemaResponse(
        this.total,
        this.totalPages,
        this.items,
        this.ratingKinopoisk,
        this.ratingImdb,
        this.year,
        this.type,
        this.posterUrl,
        this.posterUrlPreview
    )
}
fun FilterCinemaResponse.toDomain() : FilterCinemaData{
    return FilterCinemaData(
        this.total,
        this.totalPages,
        this.items,
        this.ratingKinopoisk,
        this.ratingImdb,
        this.year,
        this.type,
        this.posterUrl,
        this.posterUrlPreview
    )
}
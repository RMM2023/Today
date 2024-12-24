package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Films

data class FilmsData (
        val filmId: Int,
        val nameRu: String,
        val nameEn: String,
        val type: String,
        val year: String,
        val description: String,
        val filmLength: String,
        val country: List<СountriesData>,
        val genre: List<GenresData>,
        val rating: String,
        val ratingVoteCount: Int,
        val posterUrl: String,
        val posterUrlPreview: String
)
fun FilmsData.toData() : Films {
        return Films(
                this.filmId,
                this.nameRu,
                this.nameRu,
                this.type,
                this.year,
                this.description,
                this.filmLength,
                this.country,
                this.genre,
                this.rating,
                this.ratingVoteCount,
                this.posterUrl,
                this.posterUrlPreview
        )
}
fun Films.toDomain() : FilmsData {
        return FilmsData(
                this.filmId,
                this.nameRu,
                this.nameRu,
                this.type,
                this.year,
                this.description,
                this.filmLength,
                this.country,
                this.genre,
                this.rating,
                this.ratingVoteCount,
                this.posterUrl,
                this.posterUrlPreview
        )
}
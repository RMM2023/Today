package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Genres

data class GenresData(
    val id: Int,
    val genre: String
)
fun GenresData.toData() : Genres {
    return Genres(
        this.id,
        this.genre
    )
}
fun Genres.toDomain() : GenresData{
    return GenresData(
        this.id,
        this.genre
    )
}

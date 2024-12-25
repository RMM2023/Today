package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Films
import com.portfoliormm.today.data.model.FilmsByWordResponse

data class FilmsByWordData(
    val keyword: String,
    val pagesCount: Int,
    val searchFilmsCountResult: Int,
    val films: List<FilmsData>
)
fun FilmsByWordData.toData() : FilmsByWordResponse{
    return FilmsByWordResponse(
        this.keyword,
        this.pagesCount,
        this.searchFilmsCountResult,
        this.films.map { it.toData() }
    )
}
fun FilmsByWordResponse.toDomain() : FilmsByWordData{
    return FilmsByWordData(
        this.keyword,
        this.pagesCount,
        this.searchFilmsCountResult,
        this.films.map { it.toDomain() }
    )
}

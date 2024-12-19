package com.portfoliormm.today.data.model

data class FilmsByWordResponse(
    val keyword: String,
    val pagesCount: Int,
    val searchFilmsCountResult: Int,
    val films: List<Films>
)

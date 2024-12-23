package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.Films

data class FilmsByWordData(
    val keyword: String,
    val pagesCount: Int,
    val searchFilmsCountResult: Int,
    val films: List<Films>
)

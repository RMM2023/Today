package com.portfoliormm.today.data.model.dataclass

data class KeyWord(
    val keyword: String,
    val pagesCount: Int,
    val searchFilmsCountResult: Int,
    val films: List<Films>
)

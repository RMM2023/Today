package com.portfoliormm.today.data.model

data class ItemsWebsite(
    val url: String,
    val platform: String,
    val logoUrl: String,
    val positiveRating: Int,
    val negativeRating: Int,
    val author: String,
    val title: String,
    val description: String
)

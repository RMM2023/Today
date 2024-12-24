package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsWebsite

data class ItemsWebsiteData(
    val url: String,
    val platform: String,
    val logoUrl: String,
    val positiveRating: Int,
    val negativeRating: Int,
    val author: String,
    val title: String,
    val description: String
)
fun ItemsWebsiteData.toData() : ItemsWebsite{
    return ItemsWebsite(
        this.url,
        this.platform,
        this.logoUrl,
        this.positiveRating,
        this.negativeRating,
        this.author,
        this.title,
        this.description
    )
}
fun ItemsWebsite.toDomain() : ItemsWebsiteData{
    return ItemsWebsiteData(
        this.url,
        this.platform,
        this.logoUrl,
        this.positiveRating,
        this.negativeRating,
        this.author,
        this.title,
        this.description
    )
}

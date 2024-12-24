package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsWebsite
import com.portfoliormm.today.data.model.WebsiteResponse

data class WebsiteData(
    val total: Int,
    val itemsWebsite: List<ItemsWebsite>
)
fun WebsiteData.toData() : WebsiteResponse{
    return WebsiteResponse(
        this.total,
        this.itemsWebsite
    )
}
fun WebsiteResponse.toDomain() : WebsiteData{
    return WebsiteData(
        this.total,
        this.itemsWebsite
    )
}

package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsPremiere
import com.portfoliormm.today.data.model.PremiereResponse

data class PremierData(
    val total: Int,
    val itemsPremiere: List<ItemsPremiere>
)
fun PremierData.toData() : PremiereResponse{
    return PremiereResponse(
        this.total,
        this.itemsPremiere
    )
}
fun PremierData.toDomain() : PremiereResponse{
    return PremiereResponse(
        this.total,
        this.itemsPremiere
    )
}

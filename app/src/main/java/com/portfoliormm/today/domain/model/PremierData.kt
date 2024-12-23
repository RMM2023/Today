package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsPremiere

data class PremierData(
    val total: Int,
    val itemsPremiere: List<ItemsPremiere>
)

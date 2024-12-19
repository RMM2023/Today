package com.portfoliormm.today.data.model

data class ItemsBudget(
    val type: String,
    val amount: Int,
    val currencyCode: String,
    val name: String,
    val symbol: Char
)
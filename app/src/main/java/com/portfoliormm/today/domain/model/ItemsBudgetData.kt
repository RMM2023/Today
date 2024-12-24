package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsBudget

data class ItemsBudgetData(
    val type: String,
    val amount: Int,
    val currencyCode: String,
    val name: String,
    val symbol: Char
)
fun ItemsBudgetData.toData() : ItemsBudget{
    return ItemsBudget(
        this.type,
        this.amount,
        this.currencyCode,
        this.name,
        this.symbol
    )
}
fun ItemsBudget.toDomain() : ItemsBudgetData{
    return ItemsBudgetData(
        this.type,
        this.amount,
        this.currencyCode,
        this.name,
        this.symbol
    )
}

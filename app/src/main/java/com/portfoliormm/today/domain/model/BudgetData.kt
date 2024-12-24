package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.BudgetResponse
import com.portfoliormm.today.data.model.ItemsBudget

data class BudgetData(
    val total: Int,
    val items: List<ItemsBudget>
)
fun BudgetData.toData() : BudgetResponse {
    return BudgetResponse(
        this.total,
        this.items
    )
}
fun BudgetResponse.toDomain() : BudgetData {
    return BudgetData(
        this.total,
        this.items
    )
}

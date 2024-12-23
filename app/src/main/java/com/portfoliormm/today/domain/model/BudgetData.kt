package com.portfoliormm.today.domain.model

import com.portfoliormm.today.data.model.ItemsBudget

data class BudgetData(
    val total: Int,
    val items: List<ItemsBudget>
)

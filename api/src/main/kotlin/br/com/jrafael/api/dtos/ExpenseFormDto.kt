package br.com.jrafael.api.dtos

import br.com.jrafael.common.dtos.BaseDto
import br.com.jrafael.domain.entities.Expense
import java.math.BigDecimal

data class ExpenseFormDto(
    val name: String,
    val description: String,
    val amount: BigDecimal
) : BaseDto<Expense>() {

    override fun convert(): Expense =
        Expense(
            name = name,
            description = description,
            amount = amount
        )


}

package br.com.jrafael.persistence.extensions

import br.com.jrafael.domain.entities.Expense
import br.com.jrafael.persistence.models.ExpenseEntity

fun ExpenseEntity.toExpenseDomain(): Expense =
    Expense(
        id = this.id,
        name = this.name,
        description = this.description,
        amount = this.amount,
        date = this.date
    )


fun Expense.toExpenseEntity(): ExpenseEntity =
    ExpenseEntity(
        id = this.id,
        name = this.name,
        description = this.description,
        amount = this.amount,
        date = this.date
    )

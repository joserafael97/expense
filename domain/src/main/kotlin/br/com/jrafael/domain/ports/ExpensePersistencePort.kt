package br.com.jrafael.domain.ports

import br.com.jrafael.domain.entities.Expense

interface ExpensePersistencePort {
    fun create(expense: Expense): Expense
    fun get(): List<Expense>
}

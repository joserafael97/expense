package br.com.jrafael.persistence.adapters

import br.com.jrafael.domain.entities.Expense
import br.com.jrafael.domain.ports.ExpensePersistencePort
import br.com.jrafael.persistence.extensions.toExpenseDomain
import br.com.jrafael.persistence.extensions.toExpenseEntity
import br.com.jrafael.persistence.repositories.ExpenseEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseRepositoryImpl() : ExpensePersistencePort {

    @Autowired
    lateinit var repository: ExpenseEntityRepository

    override fun create(expense: Expense): Expense = repository.save(expense.toExpenseEntity()).toExpenseDomain()

    override fun get(): List<Expense> = repository.findAll().map {
        it.toExpenseDomain()
    }

}

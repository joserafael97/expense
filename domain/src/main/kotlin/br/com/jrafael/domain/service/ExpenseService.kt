package br.com.jrafael.domain.service

import br.com.jrafael.domain.entities.Expense
import br.com.jrafael.domain.ports.BaseServicePort
import br.com.jrafael.domain.ports.ExpensePersistencePort
import br.com.jrafael.domain.ports.LoggableInstancePort
import br.com.jrafael.domain.util.validations.ValidatorExecutor

class ExpenseService(private val persistence: ExpensePersistencePort) : BaseServicePort<Expense> {

    override fun create(entity: Expense): Expense {
        logger.info("process to create a new expense started")
        ValidatorExecutor.validate(entity)
        logger.info("process to validate finished")
        return persistence.create(entity)
    }

    fun get() = persistence.get()

    companion object {
        private val logger = LoggableInstancePort.getLoggableInstance()
    }

}

package br.com.jrafael.domain.util.validations

import br.com.jrafael.domain.entities.Expense

class ValidatorExecutor {
    companion object {
        fun validate(model: Expense) {
            AmountValidator()
        }
    }
}

package br.com.jrafael.domain.util.validations

import br.com.jrafael.domain.entities.Expense
import br.com.jrafael.domain.exceptions.BusinessException
import java.math.BigDecimal

class AmountValidator: Validator(null) {
    override fun performValidation(model: Expense) {
        if (model.amount.compareTo(BigDecimal.ZERO) < 1 ){
            throw BusinessException("Not positive value")
        } else {
            nextValidator?.also{
                it.performValidation(model)
            }
        }
    }
}

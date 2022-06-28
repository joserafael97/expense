package br.com.jrafael.domain.util.validations

import br.com.jrafael.domain.entities.Expense

abstract class Validator(nextValidator: Validator?) {

    protected val nextValidator = nextValidator

    abstract fun performValidation(model: Expense)

    fun validate(model: Expense) = performValidation(model)
}

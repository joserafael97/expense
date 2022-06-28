package br.com.jrafael.domain.exceptions

import br.com.jrafael.domain.entities.enums.TypeError

class BusinessException(
    val error: String,
    val type: TypeError = TypeError.BUSINESS_VALIDATION
) : Exception()

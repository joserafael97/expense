package br.com.jrafael.api.dtos

import java.math.BigDecimal
import java.time.LocalDateTime

data class ExpenseDto(
    val id: String,
    val name: String,
    val description: String,
    val amount: BigDecimal,
    val date: LocalDateTime
)

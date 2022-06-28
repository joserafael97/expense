package br.com.jrafael.domain.entities

import java.math.BigDecimal
import java.time.LocalDateTime

data class Expense(
    val id: String? = "",
    val name: String,
    val description: String,
    val amount: BigDecimal = BigDecimal.ZERO,
    //val user: User,
    val date: LocalDateTime? = LocalDateTime.now()
)

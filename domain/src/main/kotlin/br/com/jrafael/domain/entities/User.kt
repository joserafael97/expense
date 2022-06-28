package br.com.jrafael.domain.entities

import java.time.LocalDateTime

data class User(
    val id: String,
    val name: String,
    val email: String,
    val data: LocalDateTime,
)

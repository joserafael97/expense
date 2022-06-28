package br.com.jrafael.persistence.models

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "expense")
data class ExpenseEntity(
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(updatable = false, nullable = false, unique = true)
    val id: String?,
    val name: String,
    val description: String,
    val amount: BigDecimal = BigDecimal.ZERO,
    //val user: User,
    val date: LocalDateTime? = LocalDateTime.now()
)

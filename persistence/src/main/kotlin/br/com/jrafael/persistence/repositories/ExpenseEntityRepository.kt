package br.com.jrafael.persistence.repositories

import br.com.jrafael.persistence.models.ExpenseEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ExpenseEntityRepository : JpaRepository<ExpenseEntity, Int>{
}

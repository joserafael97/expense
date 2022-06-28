package br.com.jrafael.api.controllers

import br.com.jrafael.api.dtos.ExpenseDto
import br.com.jrafael.api.dtos.ExpenseFormDto
import br.com.jrafael.common.BaseController
import br.com.jrafael.domain.entities.Expense
import br.com.jrafael.domain.service.ExpenseService
import io.micrometer.core.annotation.Timed
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import javax.validation.Valid

@RestController
@RequestMapping("/v1/api/expenses")
class ExpenseController(@Autowired var expenseService: ExpenseService) : BaseController<Expense, ExpenseDto>() {

    @Timed(value = "expenses.time", description = "Time create new expense")
    @PostMapping
    fun post(@RequestBody @Valid form: ExpenseFormDto): ExpenseDto {
        return convert(expenseService.create(form.convert()))
    }


    @Timed(value = "expenses.time", description = "Time taken to return expenses list")
    @GetMapping
    fun get(): List<Expense> {
        return expenseService.get()
    }

    override fun convert(entity: Expense): ExpenseDto = ExpenseDto(
        id = entity.id!!,
        name = entity.name,
        description = entity.description,
        amount = entity.amount,
        date = entity.date!!
    )
}

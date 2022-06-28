package br.com.jrafael.common

import br.com.jrafael.common.dtos.BaseDto
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

abstract class PostController<T, K>: BaseController<T, K>() {

    @PostMapping
    @Transactional
    open fun post(@RequestBody @Valid form: BaseDto<T>): ResponseEntity<K> {
        //val entity = service.create(form.convert())
        return ResponseEntity.ok(null)
    }

}

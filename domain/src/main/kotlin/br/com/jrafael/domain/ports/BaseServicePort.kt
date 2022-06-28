package br.com.jrafael.domain.ports

interface BaseServicePort<T> {
    fun create(entity: T): T
}


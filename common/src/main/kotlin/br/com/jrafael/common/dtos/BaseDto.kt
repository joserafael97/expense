package br.com.jrafael.common.dtos

abstract class BaseDto<T>  {
    abstract fun convert(): T
}

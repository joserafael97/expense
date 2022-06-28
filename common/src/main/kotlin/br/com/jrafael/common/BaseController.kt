package br.com.jrafael.common

abstract class BaseController<T, K> {

    abstract fun convert(entity: T): K

    companion object {
        const val PAGE_NUMBER_PARAM = "page"
        const val PAGE_SIZE_PARAM = "size"
    }

}

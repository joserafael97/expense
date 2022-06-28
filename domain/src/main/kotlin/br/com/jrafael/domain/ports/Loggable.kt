package br.com.jrafael.domain.ports

interface Loggable{
    fun trace(message: String)
    fun info(message: String)
    fun error(message: String)
    fun warn(message: String)
    fun debug(message: String)
}


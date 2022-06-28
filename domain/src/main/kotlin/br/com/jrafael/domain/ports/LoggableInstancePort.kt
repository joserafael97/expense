package br.com.jrafael.domain.ports

class LoggableInstancePort {
    companion object {
        private lateinit var logger: Loggable

        fun setLoggableInstance(loggable: Loggable) = run { logger = loggable }
        fun getLoggableInstance() = logger
    }
}

package br.com.jrafael.api.adapters

import br.com.jrafael.domain.ports.Loggable
import org.apache.logging.log4j.LogManager

class LoggableAdapter: Loggable{

    override fun trace(message: String) {
        logger.trace(message)
    }

    override fun info(message: String) {
        logger.info(message)
    }

    override fun error(message: String) {
        logger.error(message)
    }

    override fun warn(message: String) {
        logger.warn(message)
    }

    override fun debug(message: String) {
        logger.debug(message)
    }

    companion object {
        private val logger = LogManager.getLogger()
    }
}

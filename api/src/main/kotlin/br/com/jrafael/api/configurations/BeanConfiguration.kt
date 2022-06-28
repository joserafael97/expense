package br.com.jrafael.api.configurations

import br.com.jrafael.api.adapters.LoggableAdapter
import br.com.jrafael.domain.ports.LoggableInstancePort
import br.com.jrafael.domain.service.ExpenseService
import br.com.jrafael.persistence.adapters.ExpenseRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {

    @Bean
    fun expenseService(repositoryImpl: ExpenseRepositoryImpl): ExpenseService {
        LoggableInstancePort.setLoggableInstance(LoggableAdapter())
        return ExpenseService(repositoryImpl)
    }
}

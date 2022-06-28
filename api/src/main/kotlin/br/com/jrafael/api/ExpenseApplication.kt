package br.com.jrafael.api

import io.micrometer.core.aop.TimedAspect
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["br.com.jrafael.api"])
@EnableJpaRepositories(basePackages = ["br.com.jrafael.persistence"])
@EntityScan(basePackages = ["br.com.jrafael.persistence"])
@ComponentScan(
    basePackages = [
        "br.com.jrafael.domain",
        "br.com.jrafael.persistence",
        "br.com.jrafael.api"
    ]
)
class ExpensesApplication {
    /**
     * This is required so that we can use the @Timed annotation
     * on methods that we want to time.
     * See: https://micrometer.io/docs/concepts#_the_timed_annotation
     */
    @Bean
    fun timedAspect(registry: MeterRegistry?): TimedAspect? {
        return TimedAspect(registry!!)
    }
}

fun main(args: Array<String>) {
    runApplication<ExpensesApplication>(*args)
}


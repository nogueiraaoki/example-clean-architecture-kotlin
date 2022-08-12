package com.example.clean.arch.adapter.config

import com.example.clean.arch.domain.port.ProcessoAberturaRepository
import com.example.clean.arch.usecase.CriaProcessoAberturaUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseConfiguration {

    @Bean
    fun criaProcessoUseCase(processoAberturaRepository: ProcessoAberturaRepository): CriaProcessoAberturaUseCase =
        CriaProcessoAberturaUseCase(processoAberturaRepository)
}
package com.example.clean.arch.usecase

import com.example.clean.arch.domain.entity.CriaProcessoAberturaInput
import com.example.clean.arch.domain.entity.ProcessoAbertura
import com.example.clean.arch.domain.port.ProcessoAberturaRepository

class CriaProcessoAberturaUseCase(
    private val processoAberturaRepository: ProcessoAberturaRepository
) {
    fun execute(input: CriaProcessoAberturaInput): ProcessoAbertura {
        val processoAbertura = ProcessoAbertura.from(input)
        return processoAberturaRepository.save(processoAbertura)
    }
}

package com.example.clean.arch.adapter.controller

import com.example.clean.arch.adapter.converter.ProcessoAberturaConverter
import com.example.clean.arch.adapter.converter.ProcessoAberturaOutput
import com.example.clean.arch.domain.entity.CriaProcessoAberturaInput
import com.example.clean.arch.usecase.CriaProcessoAberturaUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prcessoAbertura")
class ProcessoAberturaController(
    private val criaProcessoAberturaUseCase: CriaProcessoAberturaUseCase,
    private val processoAberturaConverter: ProcessoAberturaConverter
) {

    @PostMapping
    fun criaProcesso(@RequestBody input: CriaProcessoAberturaInput): ProcessoAberturaOutput {
        val processoAbertura = criaProcessoAberturaUseCase.execute(input)
        return processoAberturaConverter.convert(processoAbertura)
    }
}
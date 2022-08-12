package com.example.clean.arch.domain.port

import com.example.clean.arch.domain.entity.ProcessoAbertura

interface ProcessoAberturaRepository {
    fun save(processoAbertura: ProcessoAbertura): ProcessoAbertura
}
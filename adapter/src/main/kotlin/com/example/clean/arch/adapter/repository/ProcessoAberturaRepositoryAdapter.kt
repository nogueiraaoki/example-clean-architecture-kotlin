package com.example.clean.arch.adapter.repository

import com.example.clean.arch.domain.entity.ProcessoAbertura
import com.example.clean.arch.domain.port.ProcessoAberturaRepository
import org.springframework.stereotype.Repository

@Repository
class ProcessoAberturaRepositoryAdapter : ProcessoAberturaRepository {
    override fun save(processoAbertura: ProcessoAbertura): ProcessoAbertura {
        return processoAbertura
    }
}
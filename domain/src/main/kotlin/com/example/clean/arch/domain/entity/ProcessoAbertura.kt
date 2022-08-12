package com.example.clean.arch.domain.entity

import java.time.Instant
import java.util.UUID

data class ProcessoAbertura(
    val id: UUID,
    val cpf: String,
    val protocoloViabilidade: String?,
    val protocoloDbe: String?,
    val status: ProcessoAberturaStatus,
    val dataCriacao: Instant,
    val dataAtualizacao: Instant
) {
    companion object {
        fun from(input: CriaProcessoAberturaInput): ProcessoAbertura = ProcessoAbertura(
            id = UUID.randomUUID(),
            cpf = input.cpf,
            protocoloViabilidade = null,
            protocoloDbe = null,
            status = ProcessoAberturaStatus.VIABILIDADE_PENDENTE,
            dataCriacao = Instant.now(),
            dataAtualizacao = Instant.now()
        )
    }
}

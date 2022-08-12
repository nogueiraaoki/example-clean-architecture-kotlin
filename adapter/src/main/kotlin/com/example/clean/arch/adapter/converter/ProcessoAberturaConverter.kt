package com.example.clean.arch.adapter.converter

import com.example.clean.arch.domain.entity.ProcessoAbertura
import com.example.clean.arch.domain.entity.ProcessoAberturaStatus
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component
import java.util.*


@Component
class ProcessoAberturaConverter : Converter<ProcessoAbertura, ProcessoAberturaOutput> {
    override fun convert(source: ProcessoAbertura): ProcessoAberturaOutput = ProcessoAberturaOutput(
        id = source.id,
        cpf = source.cpf,
        protocoloViabilidade = source.protocoloViabilidade,
        protocoloDbe = source.protocoloDbe,
        status = source.status,
    )
}


data class ProcessoAberturaOutput(
    val id: UUID,
    val cpf: String,
    val protocoloViabilidade: String?,
    val protocoloDbe: String?,
    val status: ProcessoAberturaStatus
)
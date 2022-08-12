# Exemplo clean architecture
Orquestrador de atuadores para abertura de empresa

Respeitar conceitos do clean arch:
- Camadas mais internas não devem conhece camadas mais externas
- Não usar gateways nas camadas de domain e usecase

## Requisitos da aplicação
Como atuador(robô), gostaria de manter um crud do processo de abertura de empresa com:
- CPF
- Protocolo de viabilidade;
- Protocolo do DBE, 
- Status do processo
- Data de criação do processo;
- Data de atualização do processo;

## Passos para abrir uma empresa
- Preencher viabilidade na Junta comercial;
- Gerar guia de pagamento da junta comercial;
- Aguardar a aprovação da viabilidade;
- Preencher DBE na Receita federal;
- Gerar guia de pagamento da DBE;
- Aguardar aprovação do DBE;

## Regras de negócio:
- Incialmente, os protocolos serão nulo e o status viabilidade pendente;
- Ao preencher viabilidade, deve salvar o protocolo e mudar os status viabilidade preenchida;
- Ao preencher DBE, deve salvar o protocolo e mudar o status para DBE preenchido

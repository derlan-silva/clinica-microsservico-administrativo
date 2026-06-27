\# 🏥 Sistema Integrado de Gestão Médica - Microsserviço Administrativo



Este repositório contém o \*\*Microsserviço Administrativo\*\*, componente fundamental do Sistema Integrado de Gestão Médica desenvolvido para o Projeto Integrador (PI). Este módulo opera de forma independente, utilizando uma arquitetura moderna baseada em microsserviços.



\---



\## 👥 Estrutura do Grupo e Papéis (PI)

\* \*\*Integrante 1:\*\* Tech Lead / Infra \& Gateway (Configuração do Spring Cloud Gateway, Docker, Security JWT).

\* \*\*Integrante 2:\*\* Dev Microsserviço Agendamento (Spring Boot + JPA, Lógica de Agendamento).

\* \*\*Integrante 3:\*\* Dev Microsserviço Atendimento (Spring Boot + JPA, Prontuário, Anamnese).

\* \*\*Integrante 4 (Derlan - Meu Papel):\*\* Dev Microsserviço Administrativo (Gerenciamento de Funcionários, Médicos, Especialidades, Convênios e validações de dados).

\* \*\*Integrante 5:\*\* QA, Doc \& Testes (Collections Postman, OpenAPI/SpringDoc, JUnit).



\---



\## 🛠️ Tecnologias Utilizadas no Microsserviço

\* \*\*Ambiente de Execução:\*\* Java 17

\* \*\*Framework Principal:\*\* Spring Boot 3.5.15 (ou versão 3.5.x estável)

\* \*\*Gerenciador de Dependências:\*\* Maven

\* \*\*Banco de Dados:\*\* PostgreSQL

\* \*\*Formato de Configuração:\*\* YAML (`application.yml`)



\---



\## 🎯 Funcionalidades Escopadas (Módulo Administrativo)

Com base nos Diagramas de Casos de Uso e de Classes, as seguintes regras de negócio e rotas foram implementadas neste microsserviço:

1\. \*\*Manter Funcionários:\*\* Cadastro completo vinculando dados pessoais, credenciais de acesso (`isBlock`, `isAdmin`) e endereço.

2\. \*\*Manter Especialidades:\*\* Cadastro e descrição das especialidades médicas atendidas na clínica.

3\. \*\*Manter Convênios:\*\* Registro de empresas parceiras, CNPJ e contatos telefônicos.

4\. \*\*Manter Médicos:\*\* Associação de funcionários ao seu respectivo CRM e Especialidade Médica.



\---



\## 🚀 Como Executar o Projeto Localmente



\### Pré-requisitos

\* Java 17 instalado.

\* Maven instalado.

\* Banco de dados PostgreSQL ativo.



\### Configuração do Banco de Dados

Crie um banco de dados no PostgreSQL chamado `clinica\_administrativo` e certifique-se de configurar o arquivo `src/main/resources/application.yml` com suas credenciais locais.



\### Rodando a Aplicação

No terminal do seu computador, execute os comandos:

```bash

mvn clean install

mvn spring-boot:run


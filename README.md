# 🏥 Sistema de Clínica Médica - Microsserviço Administrativo

## 👥 Integrantes do Grupo e Papéis
* **Lucas Paris** - Tech Lead / Infra & Gateway (Configuração do Spring Cloud Gateway, Docker, Security JWT)
* **Joao Gabriel** - Dev Microsserviço Agendamento (Spring Boot + JPA, Lógica de Agendamento)
* **Lucas Silveira** - Dev Microsserviço Atendimento (Spring Boot + JPA, Prontuário, Anamnese)
* **Geovani** - Dev Microsserviço Administrativo (Gerenciamento de Funcionários, Médicos, Especialidades, Convênios e validações de dados)
* **Derlan Silva:** QA, Doc & Testes (Criando Collections no Postman, Documentação com OpenAPI/SpringDoc e Testes Unitários com JUnit)

---

## 📌 Sobre o Subprojeto
Este é o microsserviço responsável por toda a base cadastral e administrativa da clínica. Ele gerencia o fluxo de funcionários, médicos, especialidades médicas e convênios aceitos, aplicando regras de validação rigorosas, contando com uma cobertura completa de testes e documentação automatizada.

### 🛠️ Tecnologias Utilizadas
* **Java 17** (Linguagem base obrigatória)
* **Spring Boot 3.5.15** (Framework para criação da API)
* **Spring Data JPA** (Persistência e comunicação com o banco)
* **PostgreSQL** (Banco de dados relacional para os cadastros)
* **JUnit & Postman** (Ferramentas de testes e validação da API)
* **YAML (`application.yml`)** (Formato de configuração das propriedades)

---

## ⚙️ Configuração do Banco de Dados (PostgreSQL)

Para rodar este microsserviço localmente, a configuração no arquivo `src/main/resources/application.yml` deve seguir o padrão abaixo:

```yaml
spring:
  application:
    name: clinica-administrativo-module
  datasource:
    url: jdbc:postgresql://localhost:5432/clinica_administrativo
    username: postgres
    password: seu_password_aqui
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

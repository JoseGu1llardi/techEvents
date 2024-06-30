# eventostec

Backend da Plataforma centralizadora de eventos e meetups da comunidade tech feita para estudar conceitos fundamentais de Java Spring, Postgres & AWS.

## Índice

- [Introdução](#introdução)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Configuração](#configuração)

## Introdução

O **eventostec** é uma plataforma que centraliza eventos e meetups da comunidade tech. Este projeto foi desenvolvido com o intuito de estudar e aplicar conceitos fundamentais de Java Spring, Postgres e AWS.

## Tecnologias Utilizadas

- **Java Spring:** Framework para o desenvolvimento do backend.
- **PostgreSQL:** Banco de dados relacional.
- **AWS:** Serviços de deploy e gerenciamento de infraestrutura.
- **Docker:** Plataforma para desenvolvimento, deploy e execução de aplicações.
- **LocalStack:** Framework para simular serviços da AWS localmente.

## Funcionalidades

- **Criação de Eventos:** Permite aos usuários criar e gerenciar eventos.
- **Listagem de Eventos:** Exibe uma lista de eventos disponíveis.
- **Inscrição em Eventos:** Usuários podem se inscrever em eventos.
- **Notificações:** Envia notificações sobre novos eventos e atualizações.

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Docker](https://www.docker.com/get-started)
- [LocalStack](https://github.com/localstack/localstack)

## Instalação

1. Clone o repositório:

   ```bash
   git clone [https://github.com/JoseGu1llardi/techEvents.git]
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd eventostec
   ```

3. Instale as dependências:

   ```bash
   mvn install
   ```

## Configuração

1. Crie um banco de dados PostgreSQL:

   ```sql
   CREATE DATABASE eventostec;
   ```

2. Configure o arquivo `application.properties` com as suas credenciais do PostgreSQL:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/eventostec
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   ```

# ZUP API Rest

> Este é o projeto realizado como desafio em uma das etapas de seleção da ZUP.

## Tecnologias utilizadas no projeto
* Java 11
* IDE - STS
* SpringBoot
* Mysql
* Flyway
* Astha
* Git e GitHub
* Maven
* Postman

## TaksLists - Criar 3 endpoint's
- [x] Cadastro de usuário.
- [x] Listagem de usuário específico.
- [ ] Cadastro de veículo com dados da API FIPE.

## Dependências do projeto
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-boot-devtools
* mysql-connector-java
* spring-boot-starter-validation
* spring-boot-starter-webflux
* flyway-core

## EndPoint's do projeto
* Cadastrar usuários: Método Post para http://localhost:8080/usuarios (após o cadastro a API retorna o id do usuário cadastrado)
* Listar usuários por id: Método Get para http://localhost:8080/usuarios/id
* Consumo da API da FIPE: Método Get para http://localhost:8080/carros/1993-1
* Salvar veículos: Método Post para http://localhost:8080/carros.




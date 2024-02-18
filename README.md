# Email Microservice
## Desafio de Backend da Uber

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é uma API construída usando **Java, Spring Boot, AWS Simple Email Service.** Utilizando uma arquitetura limpa.

O Microserviço foi desenvolvido  para demonstrar como resolver o [Desafio de Backend da Uber](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Índice

- [Instalação](#installation)
- [Configuração](#configuration)
- [Uso](#usage)
- [Endpoints da API](#api-endpoints)
- [Base de dados](#database)
- [Contribuindo](#contributing)

## Installation

1. Clone o repositório:

```bash
git clone https://github.com/cezar-66/desafio-backend-uber.git
```

2. Instale as dependências com Maven

3. Atualize `application.properties` Colocando suas credenciais da AWS

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Uso

1. Inicie a aplicação com Maven
2. A API estará acessível em http://localhost:8080

## Endpoints da API
A API fornece os seguintes endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "liveskipperdev@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```

## Contribuindo

Contribuições são bem-vindas! Se encontrar algum problema ou tiver sugestões para melhorias, abra um problema ou envie um pull request para o repositório.

Ao contribuir para este projeto, por favor, siga o estilo de código existente, convenções de commit, e envie suas alterações em um branch separado.




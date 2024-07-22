# Plann.er

O projeto Planner é uma aplicação back-end desenvolvida em Java durante o evento NLW da Rocketseat que tem como objetivo ajudar o usuário a organizar suas viagens à trabalho ou lazer. O usuário pode criar uma viagem com nome, data de início e fim. Dentro da viagem o usuário pode planejar sua viagem adicionando atividades para realizar em cada dia.



## Stack utilizada

**Back-end:** Spring Web, Flyway, Dev Tools, Lombok, JPA, H2 Database


## Funcionalidades

- O usuário cadastra uma viagem informando o local de destino, data de início, data de término, e-mails dos convidados e também seu nome completo e endereço de e-mail;

- O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem;

- Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem;

- Na página do evento, os participantes da viagem podem adicionar links importantes da viagem como reserva do AirBnB, locais para serem visitados, etc...

- Ainda na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário;

- Novos participantes podem ser convidados dentro da página do evento através do e-mail e assim devem passar pelo fluxo de confirmação como qualquer outro convidado

## Documentação da API

#### Cadastra uma viagem

```http
  POST /trips
```

#### Retorna uma viagem

```http
  GET /trips/{tripId}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem. |

#### Atualiza uma viagem

```http
  PUT /trips/{tripId}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem a ser atualizada. |

#### Confirma uma viagem

```http
  GET /trips/{tripId}/confirm
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem a ser confirmada. |

#### Confirma um participante

```http
  POST /participants/{participantId}/confirm
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `participantId`      | `UUID` | **Obrigatório**. O ID do participante a ser confirmado. |

#### Convida um participante

```http
  POST /trips/{tripId}/invites
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para convidar algum participante. |

#### Retorna participantes

```http
  GET /trips/{tripId}/participants
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para consultar seus participantes. |

#### Cadastra uma atividade

```http
  POST /trips/{tripId}/activities
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para adicionar a atividade. |


#### Retorna atividades de uma viagem

```http
  GET /trips/{tripId}/activities
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para consultar atividades. |

#### Cria links a serem salvos para uma viagem

```http
  POST /trips/{tripId}/links
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para adicionar algum link. |

#### Retorna links de uma viagem

```http
  GET /trips/{tripId}/links
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `tripId`      | `UUID` | **Obrigatório**. O ID da viagem para consultar seus links. |

## Aprendizados

Através desse projeto que desenvolvi através do evento gratuito NLW Journey da Rocketseat, consegui compreender melhor conceitos de orientação a objetos na linguagem Java que venho estudando a alguns meses e como implementá-los em um projeto real, onde ficou mais claro ainda a importância de dominar os conceitos iniciais e básicos dessa linguagem para facilitar a construção de aplicações back-end como essa.

## Referência

 - [Plataforma Rocketseat](https://app.rocketseat.com.br)
 - [Youtube Rocketseat](https://www.youtube.com/@rocketseat/featured)

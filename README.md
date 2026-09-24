# API Lista de Tarefas

API REST desenvolvida em Java com Spring Boot para gerenciamento de tarefas.

## Tecnologias

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Funcionalidades

A API permite:

- Cadastrar uma tarefa
- Listar todas as tarefas
- Buscar uma tarefa por ID
- Atualizar uma tarefa
- Excluir uma tarefa

## Endpoints

| Método | Endpoint | Função |
|---|---|---|
| GET | /tarefas | Lista todas as tarefas |
| GET | /tarefas/{id} | Busca uma tarefa pelo ID |
| POST | /tarefas | Cadastra uma nova tarefa |
| PUT | /tarefas/{id} | Atualiza uma tarefa |
| DELETE | /tarefas/{id} | Exclui uma tarefa |

## Estrutura do Projeto

- Model - representa os dados da aplicação
- Repository - realiza o acesso aos dados
- Service - contém a lógica da aplicação
- Controller - recebe e responde às requisições HTTP

## Exemplo de JSON

{
  "nome": "Estudar Java",
  "status": "Pendente",
  "categoria": "Estudos",
  "descricao": "Praticar Spring Boot",
  "prioridade": "Alta"
}

## Autor

Jonathan Moura
# Banco de Dados

- Conceitos sobre BD
  - Banco de dados é uma coleção de dados
  - Sistema de gerenciamento de banco de dados (SGBD) é um conjunto de programas que permitem aos usuários acessar e modificar dados
  - Dicionário de dados contém metadados (dados sobre dados)
  - Modelo de dados
    - Entidade-relacionamento (ER)
    - Modelo relacional
    - Baseado em objetos
    - Semi-estruturado
  - Nível de abstração e independência de dados
    - Físico - Descreve como os dados são armazenados em baixo nível
    - Lógico - Descreve quais dados são armazenados e os relacionamentos entre eles
    - Visão - Descreve a parte de bd que um grupo de usuários pode ver
   
- Formalização de Banco de Dados
  - Data Definition Language (DDL) - Linguagem para especicação do esquema ou estrutura do
banco de dados;
    - Acessar/Manipular dados - Recuperação, inserção, exclusão ou modificação
  - Structured Query Language (SQL) - Linguagem de consulta mais utilizada atualmente
  - Propriedades ACID
    - Atomicidade - todas operações em uma transação são executadas com sucesso ou tudo é desfeito
    - Consistência - execusão de uma transação leva o banco de um estado consistente para outro estado consistente
    - Isolamento - transações podem acontecer de forma concorrente sem qualquer interferência
    - Durabilidade - ao concluir uma transição, todas modificações geradas serão persistentes

# Associação entre classes e diagrama de classes UML

## Diagrama no StarUML

![Captura de tela de 2024-04-26 21-19-07](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/bf2eae85-fd5c-45a7-ba2f-336b8f1869f5)

## Mermaid

![Captura de tela de 2024-04-26 21-26-50](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/6138b630-99fa-4fcd-8c18-d4c5ca04b831)

## Associação do tipo Dependência

- Single Responsibility Principle (SRP)
  - Cada classe deve ser responsável por uma pequena parte da funcionalidade de um software
  - Responsabilidade deve estar completamente encapsulada dentro da classe
 
- Separation of Concerns (SoC)
  - Dividir um sistema em partes que cada uma é responsável por uma preocupação diferente
  - Cada parte é desenvolvida, testada e mantida separadamente
  - Isso facilita a manutenção, reutilização e evolução do sistema

 - Exercício: Sistema para gestão de Agenda telefônica
   -  Atributos: nome, sobrenome, data de nascimento, telefone(s) e e-mail(s)
   -  Operações: adicionar, remover, atualizar, listar dados de um contato e listar todos os contatos
   -  Para cada contato é necessário guardar um rótulo e um valor
   -  Somente endereço de e-mail válido possa ser armazenado
   -  Telefones devem ser formatados para: +5548998761234 => +55 (48) 99876-1234
  
  

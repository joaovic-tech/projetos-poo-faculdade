# Projeto de POO - Sistema Simples Escolar

> Este é um projeto desenvolvido em Java durante a aula de Programação Orientada a Objetos da faculdade. O objetivo do projeto foi aplicar conceitos como classes, métodos estáticos, variáveis finais, diagramas UML e construtores.

## Funcionalidades Principais

- Aluno: Representa um aluno da escola, com atributos como matrícula, nome e CPF. Possui métodos para exibir informações do aluno.
- Professor: Representa um professor da escola, com atributos como cadastro, nome e formação. Possui método para exibir informações do professor.
- Turma: Representa uma turma da escola, com um nome, um professor responsável e uma lista de alunos. Possui método para exibir informações da turma, incluindo as informações do professor e dos alunos.

## Como Executar
- Para executar o projeto, basta rodar a classe Main que contém o método main. Este método cria instâncias de alunos, professores e turmas, demonstrando o funcionamento básico do sistema escolar.

```java
// Exemplo de criação de aluno
Aluno alunoX = new Aluno();
alunoX.matricula = 1;
alunoX.nome = "Joãozinho developer";
alunoX.CPF = "000.000.000-00";

// Outro Exemplo usando constructor
Aluno alunoY = new Aluno(2, "Javinha linguage", "111.111.111-11");
```

### Visualização do programanda executado:

![](/home/joaovic-tech/Desktop/projects/Java/Faculdade/AulaDeClasses/print-console.png)

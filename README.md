# Curso de Java - Nelio Alves

Repositório de estudos do curso **Java COMPLETO** do professor Nelio Alves. Contém os exemplos das aulas e os exercícios de fixação.

---

## Estrutura do projeto

```
src/
├── introducao/          → Primeiros passos com Java
├── entradaDados/        → Leitura de dados com Scanner
├── strings/             → Manipulação de Strings
├── loops/               → Estruturas de repetição
├── arrays/              → Vetores e ArrayLists
├── metodosEstaticos/    → Métodos estáticos e classes utilitárias
├── poo/                 → Programação Orientada a Objetos (encapsulamento)
├── dataHora/            → API de data e hora (java.time)
├── collections/         → Coleções (List, ArrayList)
├── heranca/             → Herança e polimorfismo
├── model.entities/            → Classes de entidade usadas nos exemplos
│   └── enums/           → Enumerações
├── exercicios/          → Exercícios de fixação (Ex01 ao Ex12)
└── util/                → Classes utilitárias (Calculator)
```

---

## Conteúdo por pacote

### `introducao`
| Arquivo | Descrição |
|---|---|
| `PrimeiroPrograma.java` | Lê dois inteiros e imprime a soma — primeiro contato com Scanner e `System.out` |
| `MatematicaEmJava.java` | Demonstra funções da classe `Math` (sqrt, pow, abs) |

### `entradaDados`
| Arquivo | Descrição |
|---|---|
| `EntradaDados.java` | Lê e imprime duas linhas de texto com `Scanner.nextLine()` |
| `MaiorNumero.java` | Encontra o maior entre três inteiros usando métodos auxiliares |

### `strings`
| Arquivo | Descrição |
|---|---|
| `ManipulandoString.java` | Separa uma frase por espaços com `split()` e exibe o primeiro elemento |

### `loops`
| Arquivo | Descrição |
|---|---|
| `EstruturaFor.java` | Soma N números fornecidos pelo usuário usando estrutura `for` |

### `arrays`
| Arquivo | Descrição |
|---|---|
| `Arranjo.java` | Calcula a média de alturas armazenadas em um array de doubles |
| `Arranjo2.java` | Armazena alturas em array e usa `ArrayList` com objetos `Funcionario` |
| `Estoque.java` | Gerencia estoque de produtos com adição e remoção usando a classe `Produto` |

### `metodosEstaticos`
| Arquivo | Descrição |
|---|---|
| `Circuferencia.java` | Calcula circunferência e volume de uma esfera usando a classe `Calculator` |
| `Dollars.java` | Converte dólares para reais aplicando taxa de IOF via `Calculator` |

### `poo`
| Arquivo | Descrição |
|---|---|
| `TrianguloTeste.java` | Calcula e compara a área de dois triângulos com encapsulamento |
| `SistemaBanco.java` | Sistema bancário simples com depósito e saque usando `ContaBanco` |

### `dataHora`
| Arquivo | Descrição |
|---|---|
| `DateTIme.java` | Criação, parsing e formatação de `LocalDate`, `LocalDateTime` e `Instant` |
| `ConverterDateTime.java` | Conversão entre tipos de data com fuso horário |
| `SomasDateTime.java` | Aritmética de datas (somar/subtrair dias) e cálculo de duração |

### `collections`
| Arquivo | Descrição |
|---|---|
| `ListTeste.java` | Operações com `ArrayList`: add, remove e `removeIf` com lambda |

### `heranca`
| Arquivo | Descrição |
|---|---|
| `Herançateste.java` | Testa hierarquia de herança com `ContaBanco`, `SavingsAccount` e `ContaEmpresa` |

### `model.entities`
Classes de entidade reutilizadas pelos exemplos e exercícios: `Triangulo`, `ContaBanco`, `Funcionario`, `Produto`, `TaxPayer`, `Individual`, `Company`, `Animais`, `Cachorro`, `Gato`, `Order`, `Trabalho`, entre outras.

### `exercicios`
| Arquivo | Descrição |
|---|---|
| `Exercicio1.java` | Calcula área de um círculo dado o raio |
| `Exercicio2.java` | Calcula e compara áreas de dois triângulos (fórmula de Heron) |
| `Exercicio3.java` | Calcula salário líquido e aplica aumento percentual |
| `Exercicio4.java` | Array de produtos — calcula preço médio |
| `Exercicio5.java` | Lê N números e exibe apenas os negativos |
| `Exercicio6.java` | Armazena números e calcula soma e média |
| `Exercicio7.java` | Gerencia quartos de pensionato com dados de estudantes |
| `Exercicio8Lista.java` | Lista de funcionários com aumento de salário usando `ArrayList` |
| `Exercicio9Matriz.java` | Lê matriz NxN e exibe diagonal, conta elementos negativos |
| `Exercicio10Matriz.java` | Busca um número na matriz e exibe os valores adjacentes |
| `Exercicio11Upcasting.java` | Demonstra upcasting e downcasting com `Cachorro` e `Gato` |
| `Exercicio12Polimorfismo.java` | Produtos (comum, usado, importado) com método `priceTag()` polimórfico |
| `EnumTeste.java` | Demonstra enum `OrderStatus` com a classe `Order` |
| `ExercicioFixaçãoPOO.java` | Sistema de imposto com `Individual` e `Company` — abstração e polimorfismo |
| `Matriz.java` | Template base para exercícios com matrizes |

### `util`
| Arquivo | Descrição |
|---|---|
| `Calculator.java` | Métodos estáticos para cálculo de circunferência, volume e conversão de moeda |
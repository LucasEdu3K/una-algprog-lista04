# Lista 04 - Algoritmos e Programação Comecei 23/03/2026

## Operadores Lógicos

Os **Operadores Lógicos** permitem combinar condições dentro de estruturas de decisão, como o `if`. Eles são fundamentais para criar verificações mais complexas sem precisar de vários blocos aninhados. Em Java, os principais operadores são:

- **E (AND - `&&`)**: retorna verdadeiro apenas se **todas** as condições forem verdadeiras.  
- **OU (OR - `||`)**: retorna verdadeiro se **pelo menos uma** das condições for verdadeira.  
- **NÃO (NOT - `!`)**: inverte o valor lógico da condição.  

### Exemplos em Java

```java
// Exemplo com AND (E)
if (idade >= 18 && possuiDocumento) {
    System.out.println("Entrada permitida");
}

// Exemplo com OR (OU)
if (nota >= 7 || trabalhoExtra == true) {
    System.out.println("Aluno aprovado");
}

// Exemplo com NOT (NÃO)
if (!(velocidade > 80)) {
    System.out.println("Dentro do limite de velocidade");
}

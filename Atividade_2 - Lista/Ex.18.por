programa {
  funcao inicio() {
    real numeros[10]
    cadeia mensagem

    escreva("Insira 10 valores numericos:")

    // Leitura dos valores
    para (inteiro i = 0; i < 10; i++) {
      escreva("Insira o valor #", i + 1, ": ")
      leia(numeros[i])
    }

    // Ordenação usando bubble sort
    bubbleSort(numeros)

    // Impressão dos valores ordenados
    escreva("Imprime valores ordenados:")
    para cada numero em numeros {
      escreva(numero, " ")
    }
    escreva()

    // Cálculo da soma dos valores ordenados sem o 8o. elemento
    real soma = calculateSum(numeros)

    // Impressão da soma
    escreva("Soma dos valores ordenados sem o 8o. eh: ", soma)
  }

  // Implementação do bubble sort
  funcao bubbleSort(vetor) {
    inteiro n = comprimento(vetor)
    booleano swapped

    faca {
      swapped = falso

      para (inteiro i = 1; i < n; i++) {
        se (vetor[i - 1] > vetor[i]) {
          // Troca vetor[i-1] e vetor[i]
          real temp = vetor[i - 1]
          vetor[i - 1] = vetor[i]
          vetor[i] = temp
          swapped = verdadeiro
        }
      }
    } enquanto (swapped)
  }

  // Implementação do cálculo da soma
  funcao calculateSum(vetor) {
    real soma = 0

    // Itera sobre os valores, pulando o 8o. elemento
    para (inteiro i = 0; i < comprimento(vetor); i++) {
      se (i == 7) continuar // Pula o 8o. elemento
      soma += vetor[i]
    }
    retorna soma
  }
}
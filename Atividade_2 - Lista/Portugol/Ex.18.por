programa {
  funcao inicio() {
    real numeros[10]
    cadeia mensagem

    escreva("Insira 10 valores numericos:")

    para (inteiro i = 0; i < 10; i++) {
      escreva("Insira o valor #", i + 1, ": ")
      leia(numeros[i])
    }

    bubbleSort(numeros)

    escreva("Imprime valores ordenados:")
    para (i = 0; i < 10; i++) {
      escreva("\nO valor na posicao#", i + 1, " eh: ", numeros[i])
    }
    escreva()

    real soma = calculateSum(numeros)

    escreva("\noma dos valores ordenados sem o 8o. eh: ", soma)
  }

  funcao bubbleSort(real vetor[]) {
    inteiro n = 10
    logico swapped

    faca {
      swapped = falso

      para (inteiro i = 1; i < n; i++) {
        se (vetor[i - 1] > vetor[i]) {
          real temp = vetor[i - 1]
          vetor[i - 1] = vetor[i]
          vetor[i] = temp
          swapped = verdadeiro
        }
      }
    } enquanto (swapped)
  }

  funcao calculateSum(inteiro vetor[]) {
    real soma = 0

    para (inteiro i = 0; i < 10; i++) {
      se (i != 7) { // Pula o 8o. elemento
      soma += vetor[i]
      }
    }
    retorne soma
  }
}
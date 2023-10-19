program {
  funcao inicio() {
    inteiro entrada = -999
    inteiro contador = 10
    inteiro foraIntervalo = 0

    enquanto (contador > 0) {
      escreva("Entre com um valor inteiro: ")
      leia(entrada)

      se (entrada <= 10 OU entrada >= 20) {
        foraIntervalo++
      }

      contador--
    }

    escreva("\nForam digitados " + foraIntervalo + " fora do intervalo")
    escreva("Foram digitados " + (10 - foraIntervalo) + " dentro do intervalo")
  }
}
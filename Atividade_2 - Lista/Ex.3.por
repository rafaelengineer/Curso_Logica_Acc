programa {
  funcao inicio() {
    inteiro maior = 0
    inteiro menor = 1000
    inteiro nota = 0
    inteiro notas = 6

    
    enquanto(notas>0){
      escreva("Escreva uma das notas: ")
      leia(nota)
      se (nota>maior){
        maior = nota
      }
      se (nota<menor){
        menor = nota
      }
      notas --
    }
    escreva("A maior nota foi: ", maior, "\n")
    escreva("A menor nota foi: ", menor)
  }
}

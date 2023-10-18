programa {
  funcao inicio() {
    real nota1, nota2, nota3, ME, MA
    cadeia avaliacao

    para (inteiro idx = 0; idx <= 3; idx++){
      escreva("Qual avaliação será lida: ")
      leia(avaliacao)
      escolha(avaliacao){
        caso  "1" :
          escreva("Escreva a nota1: ")
          leia(nota1)
          pare
        caso "2" :
          escreva("Escreva a nota2: ")
          leia(nota2)
          pare
        caso "3" :
          escreva("Escreva a nota3: ")
          leia(nota3)
          pare
        caso contrario:
          escreva("Escreva a nota dos exercicios: ")
          leia(ME)
          pare
      }
    }
    MA = (nota1 + nota2 * 2 + nota3 * 3 + ME) / 7
    se (MA>=9){
      escreva("A")
    }senao se (MA>=8){
      escreva("B")
    }senao se (MA>=7){
      escreva("C")
    }senao se (MA>=6){
      escreva("D")
    }senao se (MA>=4){
      escreva("E")
    }senao{
      escreva("F")
    }
  }
}
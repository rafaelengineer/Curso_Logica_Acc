programa {
  funcao inicio() {
    inteiro qtdMax = 0 
    inteiro qtdMin = 0 
    inteiro qtdEstoque = 0 

    escreva("Opa")

    escreva("Digite a quantidade em Estoque: ")
    leia (qtdEstoque)
    escreva ("Digite a quantidade M�xima: ")
    leia (qtdMax)
    escreva("Digite a quantidade M�nima: ")
    leia (qtdMin)

    se(qtdEstoque>(qtdMax+qtdMin)/2){
      escreva("N�o efetuar compra.")
    }senao{
      escreva("Efetuar compra.")
    }
  }
}

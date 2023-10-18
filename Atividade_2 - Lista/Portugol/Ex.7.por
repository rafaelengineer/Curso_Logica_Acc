programa {
  funcao inicio() {
    inteiro qtdMax = 0 
    inteiro qtdMin = 0 
    inteiro qtdEstoque = 0 

    escreva("Opa")

    escreva("Digite a quantidade em Estoque: ")
    leia (qtdEstoque)
    escreva ("Digite a quantidade Máxima: ")
    leia (qtdMax)
    escreva("Digite a quantidade Mínima: ")
    leia (qtdMin)

    se(qtdEstoque>(qtdMax+qtdMin)/2){
      escreva("Não efetuar compra.")
    }senao{
      escreva("Efetuar compra.")
    }
  }
}

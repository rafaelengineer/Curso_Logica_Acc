programa {
  funcao inicio() {
    inteiro quantidade = 0
    escreva("Quantas ma��s vc quer levar: ")
    leia(quantidade)
    se(quantidade<12){
        quantidade = quantidade * 1.3
    }
    escreva("O total a pagar �: R$", quantidade,",00")
  }
}

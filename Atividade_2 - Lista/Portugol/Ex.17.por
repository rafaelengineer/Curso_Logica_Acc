programa {
  funcao inicio() {
    inteiro nome = 0
    inteiro nomes[10]

    para (inteiro idx = 0; idx<10; idx ++){
      escreva(idx+1, "/10 -  Digite mais um numero: ")
      leia(nome)
      nomes[idx]=nome
    }
    escreva("Digite um numero para ser procurado: ")
    leia(nome)
    para (idx = 0; idx<10; idx ++){
      se(nomes[idx]==nome){
        escreva("Achei!!! Esta na posicao: ", idx+1)
        pare
      }senao se(idx==9){
        escreva("Nao encontrado, ",nome)
      }
    }

  }
}

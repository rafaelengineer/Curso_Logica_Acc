programa {
  funcao inicio() {
    cadeia nome = ""
    cadeia nomes[10]

    para (inteiro idx = 0; idx<10; idx ++){
      escreva(idx+1, "/10 -  Digite mais um nome: ")
      leia(nome)
      nomes[idx]=nome
    }
    escreva("Digite um nome para ser procurado: ")
    leia(nome)
    para (idx = 0; idx<10; idx ++){
      se(nomes[idx]==nome){
        escreva("Achei!!! Est� na posi��o: ", idx+1)
        pare
      }senao se(idx==9){
        escreva("N�o encontrado, ",nome)
      }
    }

  }
}

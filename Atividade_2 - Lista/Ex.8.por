programa {
  funcao inicio() {
    const cadeia nome_100 = "Cachorro quente"
    const cadeia nome_101 = "Bauru simples"
    const cadeia nome_102 = "Bauru com ovo"
    const cadeia nome_103 = "Hamb�rger"
    const cadeia nome_104 = "Cheeseburguer"
    const cadeia nome_105 = "Refrigerante"
    const inteiro preco_100 = 1.20
    const inteiro preco_101 = 1.30
    const inteiro preco_102 = 1.50
    const inteiro preco_103 = 1.20
    const inteiro preco_104 = 1.30
    const inteiro preco_105 = 1.00
    inteiro pedido = 0

    escreva("Insira o c�digo do pedido: ")
    leia(pedido)

    escolha(pedido){
      caso 100:
        escreva("\nPedido: " + nome_100 + "........ pre�o: " + preco_100)
        pare
      caso 101:
        escreva("\nPedido: " + nome_101 + "........ pre�o: " + preco_101)
        pare
      caso 102:
        escreva("\nPedido: " + nome_102 + "........ pre�o: " + preco_102)
        pare
      caso 103:
        escreva("\nPedido: " + nome_103 + "........ pre�o: " + preco_103)
        pare
      caso 104:
        escreva("\nPedido: " + nome_104 + "........ pre�o: " + preco_104)
        pare
      caso 105:
        escreva("\nPedido: " + nome_105 + "........ pre�o: " + preco_105)
        pare
    }
  }
}

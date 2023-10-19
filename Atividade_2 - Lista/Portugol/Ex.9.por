program {
  funcao inicio() {
    cadeia cargo = ""
    real salario = 0
    cadeia continua = "sim"
    real percentual = 0

    enquanto (continua != "n" E continua != "nao") {
      escreva("Insira o cargo: ")
      leia(cargo)
      escreva("Insira o salário: ")
      leia(salario)

      escolha(cargo.toLowerCase()) {
        caso "gerente":
          escreva("O novo salário desse gerente é de R$" + salario * 1.1)
        caso "engenheiro":
          escreva("O novo salário desse engenheiro é de R$" + salario * 1.2)
        caso "tecnico":
          escreva("O novo salário desse tecnico é de R$" + salario * 1.3)
        caso contrario:
          escreva("O novo salário desse " + cargo + " é de R$" + salario * 1.4)
      }

      escreva("Inserir mais um cargo? : ")
      leia(continua)
    }
  }
}

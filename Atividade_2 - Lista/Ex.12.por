programa {
  funcao inicio() {
    real salario = 0
    real numFilhos = 0
    real mdSalarios = 0
    real mdNumFilhos = 0
    real maiorSalario = 0
    real percSalarioAte_150 = 0
    inteiro contadorPop = 0
    cadeia controle

    enquanto(controle !="sair" e controle !="nao" e controle !="n"){
      contadorPop ++
      escreva("entre com Salario: ")
      leia(salario)
      escreva("entre com Numero de Filhos: ")
      leia(numFilhos)

      mdSalarios += salario
      mdNumFilhos += numFilhos
      se(maiorSalario<salario){
        maiorSalario = salario
      }
      se(salario<150){
        percSalarioAte_150 ++
      }
      escreva("Inserir mais dados? (ou sair)")
      leia(controle)
    }
    mdSalarios = mdSalarios/contadorPop
    mdNumFilhos = mdNumFilhos/contadorPop
    percSalarioAte_150 = 100*percSalarioAte_150/contadorPop

    escreva("\nA m�dia salarial dessa popula��o �: ",mdSalarios)
    escreva("\nA m�dia de filhos nesta popula��o �: ",mdNumFilhos)
    escreva("\nO percentual dessa popula��o que recebe menos de R$150,00: ",percSalarioAte_150, "%.")
    escreva("\nO maior sal�rio dentre essa popula��o �: ",maiorSalario)
  }
}

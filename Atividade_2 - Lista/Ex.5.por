programa {
  funcao inicio() {
    real valorHora = 0
    inteiro hrTrabalho = 0 
    real salario = 0
    const inteiro semanas = 4
    const inteiro hrSem = 40

    escreva("Digite valor hora em reais: R$")
    leia (valorHora)
    escreva("Digite o numero de horas trabalhadas: ")
    leia (hrTrabalho)

    se(hrTrabalho>semanas*hrSem){
      salario = (1.3*hrTrabalho - 0.3*semanas*hrSem)*valorHora
    }senao{
      salario = hrTrabalho*valorHora
    }

    escreva("O valor a receber é: R$",salario,",00")
  }
}

programa {
  funcao inicio() {
    real maiorAltura = -999.99
    real menorAltura = 999.99
    real somaAlturaMulheres = 0
    inteiro numHomens = 0

    para (inteiro i = 1; i <= 50; i++) {
      escreva("Informe a altura (em metros) da pessoa ", i, ": ")
      leia(altura)

      escreva("Informe o sexo (M/F) da pessoa ", i, ": ")
      leia(sexo)

      se (altura > maiorAltura) {
        maiorAltura = altura
      }

      se (altura < menorAltura) {
        menorAltura = altura
      }

      se (sexo == 'F' OU sexo == 'f') {
        somaAlturaMulheres = somaAlturaMulheres + altura
      } senao se (sexo == 'M' OU sexo == 'm') {
        numHomens = numHomens + 1
      }
    }

    real mediaAlturaMulheres = somaAlturaMulheres / 50

    escreva("Maior altura do grupo: ", maiorAltura, " metros")
    escreva("Menor altura do grupo: ", menorAltura, " metros")
    escreva("Média de altura das mulheres: ", mediaAlturaMulheres, " metros")
    escreva("Número de homens: ", numHomens)
  }
}
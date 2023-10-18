programa {
  funcao inicio() {
        inteiro matchingElements, i, j, num
        inteiro sequencia1 [5]
        inteiro sequencia2 [5]

        matchingElements = 0 
        para (i = 0; i <= 4;i++){
            j <- i + 1
            escreva("Insira o ", j, "º numero do sequencia 1: ")
            leia(num)
            sequencia1[i] <- num
          }

        para (i = 0; i <= 4;i++){
            j <- i + 1
            escreva("Insira o ", j, "º numero das sequencia 2: ")
            leia(num)
            sequencia2[i] <- num
          }

        para (i = 0; i <= 4;i++){
          para (j = 0; j <= 4;j++){
            se (sequencia1[j] == sequencia2[i]){
                matchingElements <- matchingElements + 1
            }
          }
        }

        escreva(matchingElements, " elementos coincidem nas duas sequencias!")
  }
}

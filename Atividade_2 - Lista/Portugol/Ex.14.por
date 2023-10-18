programa {
  funcao inicio() {
        inteiro matchingElements, i, j, num
        inteiro gabarito [5]
        inteiro apostas [10]

        matchingElements = 0 
        para (i = 0; i <= 4;i++){
            j <- i + 1
            escreva("Insira o ", j, "º numero do gabarito: ")
            leia(num)
            gabarito[i] <- num
          }

        para (i = 0; i <= 9;i++){
            j <- i + 1
            escreva("Insira o ", j, "º numero das apostas: ")
            leia(num)
            apostas[i] <- num
          }

        para (i = 0; i <= 4;i++){
          para (j = 0; j <= 9;j++){
            se (apostas[j] == gabarito[i]){
                matchingElements <- matchingElements + 1
            }
          }
        }

        escreva(matchingElements, " dezenas foram acertadas!")
  }
}

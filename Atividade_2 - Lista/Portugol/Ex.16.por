programa {
  funcao inicio() {
        inteiro i, j, num, i_, j_
        inteiro sequencia1 [50]

        logico matchingElements = falso
        para (i = 0; i <= 49;i++){
            j <- i + 1
            escreva("Insira o ", j, "º numero do sequencia: ")
            leia(num)
            sequencia1[i] = num
          }
        para (i = 0; i <= 48;i++){
          para (j = i++; j <= 49;j++){
            se (sequencia1[i++] == sequencia1[j]){
                i_ = i+2
                j_ = j++
                matchingElements = verdadeiro
                escreva("Os elementos das posições ", i_ , " e ", j_,"coincidem nas duas sequencias!")
            }
          }
        }

  }
}

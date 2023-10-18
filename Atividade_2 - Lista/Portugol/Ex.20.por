programa {
  funcao inicio() {
        inteiro i, j, k, l, num
        inteiro vec_x [10]
        inteiro vec_y [10]
        inteiro vec_r [20]


        para (i = 0; i <= 9;i++){
            j <- i + 1
            escreva("Insira o ", j, "o. numero do vetor X: ")
            leia(num)
            vec_x[i] <- num
          }

        para (i = 0; i <= 9;i++){
            j <- i + 1
            escreva("Insira o ", j, "o. numero do vetor Y: ")
            leia(num)
            vec_y[i] <- num
          }

        para (i = 0; i <= 20;i++){
          se (i%2 == 0){
            vec_r[i] = vec_x[k]
            k++
          }senao{
            vec_r[i] = vec_y[l]
            l++
          }
          }
          
        para (i = 0; i <= 20;i++){
          escreva(vec_r[i], ", ")
        }
  }
}

programa {
  funcao inicio() {
    inteiro A= 0, Ap = 0, B = 0, Bp = 0, B3 = 0, Nulo = 0, NuloP = 0, Qtd = 15
    caracter voto

    enquanto (Qtd > 1){
      leia(voto)

      se(voto == 'a' ou voto == 'A'){
        Qtd = Qtd - 1
        A = A + 1
      }senao se(voto == 'B' ou voto == 'b'){
        B ++
        B3 ++
        Qtd --
        se(B3==3){
          B --
          B3 = 0 
          Nulo ++
        }
      }senao{
        Nulo ++
        Qtd --
      }
      voto = ' '
    }

    Ap = 100*A/15
    Bp = 100*B/15
    NuloP = 100*Nulo/15
    escreva("Votaram em A: "+ Ap + "_%"+"\n")
    escreva("Votaram em B: "+ Bp + "_%"+"\n")
    escreva("Votaram Nulo: "+ NuloP + "_%")
    
  }
}

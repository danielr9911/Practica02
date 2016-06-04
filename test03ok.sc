disp sumadorMas3 (Int,Int,Int):Int "Suma entrada mas 3"
           = input @ 32762342342342342349 + input @ 2 + input @ 3 + 3

disp componente (Int,Int,Int,Int,Int,Int):(Int,Int,Int)
   "Funcion compleja"
   = < input @ 1 / input @ 2 * input @ 3, ((((((input @4) * 19343) - 3434) / -1234) * 2343) + 343), input @ 4 * input @ 5 * input @ 6 >

let componenteComplejo = sumadorMas3 | componente | [ < 10, 20 > ] | { noexiste >>= noexite }

{ componenteComplejo }
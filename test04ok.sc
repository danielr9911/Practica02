let dispositivo = [ <1,0,2,3,4,0,9,10> ]

let dispositivo2 = dispositivo >>= funcionCompleja
                 | dispositivo >>= funcionCompleja2
                 | dispositivo >>= [ input @ 1 +
		                     input @ 2 +
				     input @ 3 +
				     input @ 4 +
				     input @ 5 +
				     input @ 6 +
				     input @ 7 +
				     input @ 8 ]
				     
disp funcionCompleja (Int,Int,Int,Int,Int,Int,Int,Int,Int):Int
  "Un ejemplo de una funcion compleja"
  = input @ 1 + input @ 3 + input @ 5 + input @ 7

disp funcionCompleja2 (Int,Int,Int,Int,Int,Int,Int,Int,Int):Int
  "Un ejemplo de una funcion compleja"
  = input @ 2 + input @ 4 + input @ 6 + input @ 8

(dispositivo,dispositivo2,funcionCompleja,funcionCompleja2)

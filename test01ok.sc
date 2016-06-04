disp primero (Int,Int):Int "Selecciona de una tupla el primer elemento"
               = input @ 1
	       
disp segundo (Int,Int):Int "Selecciona de una tupla el segundo elemento"
               = input @ 2 
disp ignorar Int:() "Ignora la entrada" = _

let dispositivo = primero >>= segundo >>= ignorar

dispositivo

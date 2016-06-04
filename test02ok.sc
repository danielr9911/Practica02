disp id Int:Int "Funcion de identidad" = input @ 1

disp const (Int,Int):Int "Funcion constante" = input @ 1

disp noconst (Int,Int):Int "Funcion no constate" = input @ 2

let dispositivo = const >> id >> noconst

dispositivo const

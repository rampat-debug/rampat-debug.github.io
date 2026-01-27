#!/bin/bash
if [ "$#" -ne "2" ]; then
	echo "Debes introducir 2 parametros"
	echo "1. Nombre"
	echo "2. Edad"
	exit 1
else
	echo "¿Has cumplido $2 este año? (s/n)"
	read decision
	if [ "$decision" = "s" ]; then
		ano=$(date +%Y)
		((ano=ano-"$2"))
	elif [ "$decision" = "n" ]; then
		ano=$(date +%Y)
		((ano=ano-"$2"-1))
	else
		echo "Esa opcion no es valida"
		exit 1
	fi
	echo "Nombre: $1" > usuario.txt
	echo "Edad: $2" >> usuario.txt
	echo "Fecha de nacimiento: $ano" >> usuario.txt
	cat usuario.txt
	wc usuario.txt
fi
read -p "Pulsa una tecla para salir . . ."
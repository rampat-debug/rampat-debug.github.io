#!/bin/bash
if [ "$#" -eq "2" ]; then
	if [ -f "$1" ]; then
		if [ -f "$2" ]; then
			echo "El ya existe el fichero: $2"
		else
			mv "$1" "$2"
			echo "Se a renombrado el fichero"
		fi
else
	echo "Tienes que escribir 2 parametros"
	echo "1. Nombre del fichero que quieres renombrar"
	echo "2. Nombre de un fichero que NO existe"
	exit 1
fi
read -p "Pulsa una tecla para salir . . ."
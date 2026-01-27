#!/bin/bash
if [ "$#" -eq  "1" ]; then
	echo "Existe la ruta"
	if [ -d "$1" ]; then
		echo "Es un directorio"
		ls "$1"
	#Tambien puede ser un else para no tener 2 if
	#else
	#	echo "Es un archivo"
	#fi
	fi
	if [ -f "$1" ]; then
		echo "Es un archivo"
	fi
else
	echo "Tienes que escribir una ruta"
fi
#puede ser read -p "" (nombre de la variables <- recomendado si usas un switch)
echo "Pulsa una tecla para salir . . ."
read pause
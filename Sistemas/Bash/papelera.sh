#!/bin/bash
#for i in {1.."$#"} no sirve
#ejercicio 8 y 9
papelera=c:/sistemas/borrador
if [ ! -d "$papelera" ]; then
	mkdir c:/sistemas/borrador
else
	for i in "$@"
	do
		if [ -d "$i" ]; then
			echo "Es un directorio"
		elif [ -f "$i" ]; then
			mv "$i" "$papelera"
			echo "Se ha eliminado el archivo $i"
		else
			echo "No existe el archivo/directorio: $i"
		fi
	done
fi
read -p "Pulsa una tecla para salir . . ."
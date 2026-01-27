#!/bin/bash
if [ -d "$1" ]; then
	for i in "$@" 
	do
		if [ -f "$i" ] && [ $(stat -c %s "$i") -gt "50" ]; then
			rm "$i"
			echo "Se ha eliminado el archivo: $i"
		else
			echo "No se procesa el argumento: $i"
		fi
	done
else
	echo "El primer argumento tiene que ser la carpeta de trabajo"
	echo "Los otros parametros seran el nombre del archivo y su extension"
	exit 1
fi
read -p "Pulsa una trclapara salir . . ."
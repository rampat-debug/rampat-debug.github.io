#!/bin/bash
if [ $# -ne "2" ]; then
	echo "Tienes que escribir dos parametros"
	echo "1. una ruta directorio/archivo"
	echo "2. nombre del archivo de salida"
	echo "No se ha introducido 2 parametros" 2>> errores.log
	exit 1
else
	if [ -e "$1" ]; then
		echo "Ruta comprobada: $1" >> "$2"
		echo "Estado: existe" >> "$2"
		echo "Fecha: $(date)" >> "$2"
	else
		echo "El directorio/archivo no existe" 2>> errores.log
	fi
fi
read -p "Pulsa una tecla para salir . . ."
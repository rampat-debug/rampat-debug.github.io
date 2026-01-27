#!/bin/bash
# ---------------------------------------
# Script Bash con menú
# ---------------------------------------
# Definimos variables
CARPETA="$HOME/ejercicio_bash"
ARCHIVO="$CARPETA/datos.txt"
SALIR=false
# Bucle principal del menú
while [ "$SALIR" = false ]
do
clear
echo "=============================="
echo " MENU BASH - LINUX"
echo "=============================="
echo "1. Mostrar informacion del sistema"
echo "2. Crear carpeta de trabajo"
echo "3. Crear archivo de texto"
echo "4. Mostrar contenido del archivo"
echo "5. Mostrar fecha y hora"
echo "6. Salir"
echo "=============================="
read -p "Selecciona una opcion: " OPCION
case $OPCION in
1)
echo "Usuario actual: $USER"
echo "Equipo: $(hostname)"
echo "Sistema operativo:"
uname -a
read -p "Pulsa ENTER para continuar"
;;
2)
if [ ! -d "$CARPETA" ]; then
mkdir "$CARPETA"
echo "Carpeta creada correctamente."
else
echo "La carpeta ya existe."
fi
read -p "Pulsa ENTER para continuar"
;;
3)
echo "Archivo creado por el usuario $USER" > "$ARCHIVO"
echo "Archivo creado en $ARCHIVO"
read -p "Pulsa ENTER para continuar"
;;
4)
if [ -f "$ARCHIVO" ]; then
cat "$ARCHIVO"
else
echo "El archivo no existe."
fi
read -p "Pulsa ENTER para continuar"
;;
5)
date
read -p "Pulsa ENTER para continuar"
;;
6)
echo "Saliendo del programa..."
SALIR=true
;;
*)
echo "Opcion no valida."
read -p "Pulsa ENTER para continuar"
;;
esac
done

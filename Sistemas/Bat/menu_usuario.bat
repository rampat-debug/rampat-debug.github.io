@echo off
set /p nombre=Escribe tu nombre: 
:menu
cls
echo ====================
echo     Menu usuario
echo ====================
echo  1) Saludar
echo  2) Mostrar fecha
echo  3) Salir
echo ====================
set /p decision=Elige una opcion: 
echo.
if "%decision%"=="1" goto saludar
if "%decision%"=="2" goto fecha
if "%decision%"=="3" goto salir
echo Opcion invalida 
echo.
pause
goto menu
:saludar
cls
echo Hola %nombre%, ¡bienvenido!
echo.
pause
goto menu
:fecha
cls
date /t
echo.
pause
goto menu
:salir
cls
echo Adios, hasta pronto :(
echo.
pause
exit
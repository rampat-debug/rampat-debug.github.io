@echo off
:menu
cls
echo =================================
echo     Administracion de sistemas
echo =================================
echo  1) Informacion del sistema
echo  2) Cambiar el color
echo  3) Programar apagado
echo  4) Cancelar apagado
echo  5) Salir
echo =================================
set /p decision=Elige una opcion: 
echo.
if "%decision%"=="1" goto info
if "%decision%"=="2" goto color
if "%decision%"=="3" goto apagar
if "%decision%"=="4" goto cancelar
if "%decision%"=="5" goto salir
echo Opcion invalida 
echo.
pause
goto menu
:info
cls
systeminfo
echo.
pause
goto menu
:color
cls
echo =================================
echo     Colores
echo =================================
echo  1) 4f
echo  2) 70
echo  3) 5a
echo =================================
set /p decision=Elige una opcion: 
if "%decision%"=="1" color 4f
if "%decision%"=="2" color 70
if "%decision%"=="3" color 5a
echo.
pause
goto menu
:apagar
cls
shutdown /s /t 60 /c "El equipo se apagara en 60 segundos"
pause
goto menu
:cancelar
cls
shutdown /a
echo Se a cancelado el apagado
echo.
pause
goto menu
:salir
cls
echo Adios, hasta pronto :(
echo.
pause
exit
@echo off
if not exist C:\PracticaBat (
mkdir C:\PracticaBat
)
if not exist C:\PracticaBat\logs.txt (
echo Registros>C:\PracticaBat\logs.txt
)
:menu
cls
echo ========================================
echo      MENÚ PRINCIPAL - PRACTICA BAT
echo ========================================
echo   1) Crear un archivo de texto
echo   2) Mostrar contenido de un archivo
echo   3) Borrar un archivo
echo   4) Salir
echo ======================================== 
set /p decision=Elige una opcion: 
echo.
if "%decision%"=="1" goto texto
if "%decision%"=="2" goto mostrar
if "%decision%"=="3" goto borrar
if "%decision%"=="4" goto salir
echo Opcion invalida 
echo.
pause
goto menu
:texto
cls
set /p nombre=Introduce el nombre del archivo(sin extension): 
echo Creado automáticamente por practica_final.bat > C:\PracticaBat\%nombre%.txt
echo %date% %time% Se ha creado el archivo %nombre%.txt>> C:\PracticaBat\logs.txt
echo.
pause
goto menu
:mostrar
cls
for %%f in ("C:\PracticaBat\*.txt") do (
echo %%~nxf
)
set /p nombre=Que archivo quieres ver: 
echo.
if exist C:\PracticaBat\%nombre%.txt (
type C:\PracticaBat\%nombre%.txt
echo %date% %time% Se ha mostrado el contenido del archivo %nombre%.txt >> C:\PracticaBat\logs.txt
) else (
echo El archivo no existe
echo %date% %time% No se ha mostrado el contenido del archivo %nombre%.txt porque no existe >> C:\PracticaBat\logs.txt
)
echo.
pause
goto menu
:borrar
cls
for %%f in ("C:\PracticaBat\*.txt") do (
echo %%~nxf
)
set /p decision=Que archivo quieres borrar: 
echo.
if exist C:\PracticaBat\%nombre%.txt (
del C:\PracticaBat\%nombre%.txt
echo Se ha borrado el archivo %nombre%.txt
echo %date% %time% Se ha borrado el archivo %nombre%.txt >> C:\PracticaBat\logs.txt
) else (
echo El archivo no existe
echo %date% %time% No se a borrado el archivo %nombre%.txt porque no existe>> C:\PracticaBat\logs.txt
)
echo.
pause
goto menu
:salir
cls
echo Adios, hasta pronto :(
echo %date% %time% Se ha salido del programa>> C:\PracticaBat\logs.txt
echo.
pause
exit
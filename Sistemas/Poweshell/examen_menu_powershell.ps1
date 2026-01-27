$salir=$false
while (-not $salir){
    Clear-Host
    Write-Host "=============================="
    Write-Host "   MENU POWERSHELL - EXAMEN"
    Write-Host "=============================="
    Write-Host "1. Crear estructura de carpetas"
    Write-Host "2. Registrar datos del usuario"
    Write-Host "3. Mostrar archivos"
    Write-Host "4. Informacion del sistema"
    Write-Host "5. Guardar informacion en log"
    Write-Host "6. Salir"
    Write-Host "=============================="
    $rutaBase = "C:\ExamenPowerShell"
    $rutaDatos = "$rutaBase\Datos"
    $rutaUsuario = "$rutaDatos\usuario.txt"
    $rutaLogs = "$rutaDatos\log.txt"
    $opcion=Read-Host "Elige una opcion"
    switch($opcion){
        "1"{
            if (-not (Test-path $rutaBase)){
                New-Item -ItemType Directory -Path "C:\ExamenPowerShell"
            }
            if (-not (Test-path $rutaDatos)){
                New-Item -ItemType Directory -Path "$rutaBase\Datos"
            }
            if (-not (Test-path $rutaLogs)){
                New-Item -ItemType File -Path "$rutaDatos\log.txt"
            }
            if (-not (Test-path $rutaUsuario)){
                New-Item -ItemType File -Path "$rutaDatos\usuario.txt"
            }
            write-host "Se a creado la estrucura de carpetas"
            pause
        }
        "2"{
            $nombreUsuario=Read-Host "Escribe tu nombre" 
            $horaFecha=Get-DAte
            Set-Content $rutaUsuario "Nombre: $nombreUsuario"
            Add-Content $rutaUsuario "Fecha: $horaFecha"
            Write-Host "Datos guardados en usuario.txt"
            pause
        }
        "3"{
            Write-Host "Contenido de usuario.txt"
            Get-Content $rutaUsuario
            Write-Host "Todos los archivos txt de la carpeta Datos"
            Get-ChildItem -Path "$rutaDatos" -Filter "*.txt"
            pause
        }
        "4"{
            Write-Host "------------------Informacion del sistema------------------"
            Write-Host $env:COMPUTERNAME
            Write-Host $env:USERNAME
            Write-Host $PSVersionTable.PSVersion
            Write-Host "-----------------------------------------------------------"
            pause
        }
        "5"{
            Set-Content "$rutaLogs" "------------------LOGS------------------"
            add-Content "$rutaLogs" "Equipo: $env:COMPUTERNAME"
            add-Content "$rutaLogs" "Usuario: $env:USERNAME"
            add-Content "$rutaLogs" "Fecha: $(get-date)"
            add-Content "$rutaLogs" "----------------------------------------"
        }
        "6"{
            $salir=$true
        }
    }
}
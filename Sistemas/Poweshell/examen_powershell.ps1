New-Item -ItemType Directory -Path "C:\ExamenPowerShell"
$rutaOrigen = "C:\ExamenPowerShell"
$rutaDatos = "$rutaOrigen\Datos"
$rutaLogs = "$rutaDatos\logs.txt"
if (-not (Test-path $rutaOrigen)){
    New-Item -ItemType Directory -Path "C:\ExamenPowerShell"
}
if (-not (Test-path $rutaDatos)){
    New-Item -ItemType Directory -Path "C:\ExamenPowerShell\Datos"
}
if (-not (Test-path $rutaLogs)){
    New-Item -ItemType File -Path "C:\ExamenPowerShell\Datos\logs.txt"
}
$nombreUsuario = Read-Host "Introduce tu nombre"
New-Item -ItemType File -Path "$rutaDatos\usuario.txt"
set-Content "$rutaDatos\usuario.txt" "$nombreUsuario"
$fecha=Get-date
write-Host "Mostrando el contenido del archivo usuario.txt"
Add-Content "$rutaDatos\usuario.txt" "$fecha"
Get-Content "$rutaDatos\usuario.txt"
write-Host "Mostrando los archivos txt de la carpeta Datos"
Get-ChildItem -Path "$rutaDatos" -Filter "*.txt"
$Equipo=$env:COMPUTERNAME
$Usuario=whoami
$version=$PSVersionTable.PSVersion
Set-Content "$rutaLogs" "------------------Informacion del sistema------------------"
add-Content "$rutaLogs" "$Equipo"
add-Content "$rutaLogs" "$Usuario"
add-Content "$rutaLogs" "$version"
add-Content "$rutaLogs" "-----------------------------------------------------------"
write-Host "El script se ha ejecutado correctamente"
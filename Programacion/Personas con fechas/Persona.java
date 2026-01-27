public class Persona {
    
    private String nombre;
    private Fecha fechaNacimiento;

    public Persona(String nombre, Fecha fecha){
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return this.nombre + " nacio el : " + this.fechaNacimiento.toString();
    }

    // public int calcularEdad(){
    //     // Devuelve el numero de AÑOS que tiene la persona.
    // }

}

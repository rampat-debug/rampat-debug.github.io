package DiaUno;

public class Alumno {
    // Atributos de mi clase Alumno
    private String nombre;
    private String apellido;

    // para crear Alumnos necesitamos
    // un metodo especial que se llama -> Constructor
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }


    // getters -> devuelven
    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
        return nombre;
    }


    // setters -> reciben el nuevo valor
    public void setApellido(String nuevo_apellido){
        this.apellido = nuevo_apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // metodos de Alumno
    public void saludar(){
        System.out.println("Hola soy " + this.nombre + " " + this.apellido);
    }

    // metodos especiales
    @Override
    public String toString() {
        String r = this.nombre + " " + this.apellido;
        return r;
    }
}

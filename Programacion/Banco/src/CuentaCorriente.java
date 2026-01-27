import java.util.Scanner;

public class CuentaCorriente {
    final static Scanner SC = new Scanner(System.in);
    private String nombre, apellido, dni, direccion;
    private long numcuenta;
    private double saldo;
    public CuentaCorriente(String nombre, String apellido, String dni, String direccion, long numcuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double ingresarDinero(double dinero){
        this.saldo=this.saldo+dinero;
        return this.saldo;
    }
    public double sacarDinero(double dinero){
        if (this.saldo<dinero) {
            System.out.println("No puedes retirar esa cantidad");
        }
        else if (this.saldo==0){
            System.out.println("No tienes saldo en la cuenta");
        }
        else{
            this.saldo=this.saldo-dinero;
        }
        return this.saldo;
    }
    public void mostarDinero(){
        System.out.println("Saldo: "+this.saldo+"$");
    }
    public void modificarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("DNI: "+this.dni);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("---------------------------");
        System.out.println("¿Quieres modificar tus datos? (s/n)");
        String opcion=SC.nextLine();
        if (opcion.equalsIgnoreCase("s")) {
            System.out.println("¿Que quieres modificar?");
            String decision=SC.nextLine();
            if (decision.equalsIgnoreCase("nombre")) {
                System.out.print("Nombre: ");
                String n=SC.nextLine();
                this.nombre=n;
            }
            if (decision.equalsIgnoreCase("apellido")) {
                System.out.print("Apellido: ");
                String a=SC.nextLine();
                this.apellido=a;
            }
            if (decision.equalsIgnoreCase("dni")) {
                System.out.print("DNI: ");
                String dn=SC.nextLine();
                this.dni=dn;
            }
            if (decision.equalsIgnoreCase("direccion")) {
                System.out.print("Direccion: ");
                String d=SC.nextLine();
                this.direccion=d;
            }
            else{
                System.out.println("Opcion no valida");
            }
        }
        else if (opcion.equalsIgnoreCase("n")) {
            System.out.println("No se va a modificar ningun dato");
        }
        else{
            System.out.println("Opcion no valida");
        }
    }
}
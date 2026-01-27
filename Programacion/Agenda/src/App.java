import java.util.Scanner;

public class App {

    static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        Agenda mi_agenda = new Agenda("Dani", 657845712);
        Contacto contacto_1 = new Contacto("Nico", "Perez", "nico@perez.arg", 758457510);
        mi_agenda.anadirContacto(contacto_1);


        boolean seguir = true;
        while (seguir) {
            System.out.println("------------------------------");
            System.out.println("           AGENDA             ");
            System.out.println("     1 Añadir contacto");
            System.out.println("     2 Ver contactos ordenados"); // por nombre, y en caso de ser iguales por apellido
            System.out.println("     3 Buscar contacto"); // ---> me pide un nombre y me muestra los contactos con ese nombre
            System.out.println("     4 Borrar contacto");
            System.out.println("     5 Ver mis datos"); // Mostrara mi nombre, mi numero y la cantidad de contactos guardados
            System.out.println("     _ Salir");
            System.out.println("------------------------------");
            int opcion = SC.nextInt();
            SC.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Se va a crear un nuevo contacto.");
                    System.out.println("Indica el nombre: ");
                    String n = SC.nextLine();
                    System.out.println("Indica el apellido: ");
                    String a = SC.nextLine();
                    System.out.println("Indica el email: ");
                    String e = SC.nextLine();
                    System.out.println("Indica el numero: ");
                    long num = SC.nextLong();
                    SC.nextLine();

                    Contacto c_nuevo = new Contacto(n, a, e, num);
                    mi_agenda.anadirContacto(c_nuevo);
                    break;
                case 2:
                    mi_agenda.verContactos();
                    break;
                case 3:
                    System.out.println("Se va a buscar un contacto.");
                    System.out.println("Indica el nombre: ");
                    String nombreBuscar = SC.nextLine();
                    mi_agenda.buscarContacto(nombreBuscar);
                break;
                case 4:
                    System.out.println("Se va a borrar un contacto.");
                    System.out.println("Indica el nombre: ");
                    String nombreBorrar = SC.nextLine();
                    System.out.println("Indica el apellido: ");
                    String apellidoBorrar = SC.nextLine();
                    mi_agenda.borrarContacto(nombreBorrar, apellidoBorrar);
                break;
                case 5:
                    System.out.println(mi_agenda);
                break;
                default: seguir = false;
                    break; 
            }
        }
        

    }
}

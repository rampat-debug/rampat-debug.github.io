import java.util.Scanner;

public class App {
    
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduce el numero de personas que desea: ");
        int nPersonas = SC.nextInt();
        SC.nextLine();

        Persona [] personas = new Persona[nPersonas];

        for (int i = 0; i < nPersonas; i++){

            System.out.println("Introduce el nombre de la persona " + i);
            String n = SC.nextLine();
            System.out.println("Introduce el dia en que nacio : ");
            int dia = SC.nextInt();
            SC.nextLine();
            System.out.println("El mes :");
            int mes = SC.nextInt();
            SC.nextLine();
            System.out.println("Y el año....");
            int ano = SC.nextInt();
            SC.nextLine();

            Fecha f = new Fecha(dia, mes, ano);
            Persona p = new Persona(n, f);

            personas[i] = p;
        }

        for (int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
        }


        // persona mas mayor
        Persona viejito = personas[0];
        for (int i = 1; i < personas.length; i++){
            
            Fecha fecha_i = personas[i].getFechaNacimiento();
            Fecha fecha_mayor = viejito.getFechaNacimiento();

            if (fecha_i.esMenor(fecha_mayor)){
                viejito = personas[i];
            }

        }
        System.out.println("La persona mas mayor es " + viejito);
    }   

}

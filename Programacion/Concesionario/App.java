import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class App {

    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        Automovil a1 = new Automovil("Toyota", "AE86", 10000);
        Automovil a2 = new Automovil("Toyota", "Yaris", 23000);
        Automovil a3 = new Automovil("Ford", "Mustang", 33000);
        Automovil a4 = new Automovil("Ford", "Fiesta", 8000);

        Automovil [] COCHES = {a1, a2, a3, a4};

        boolean seguir = true;

        while (seguir == true) {
            System.out.println("-------------------------");
            System.out.println("1 - Ver todos los coches");
            System.out.println("2 - Filtrar por marca");
            System.out.println("3 - Filtrar por precio");
            System.out.println("4 - Añadir coche");
            System.out.println("5 - Ordenar por precios");
            System.out.println("6 - Salir");
            System.out.println("-------------------------");
            int opcion = SC.nextInt();
            SC.nextLine();

            switch (opcion) {
                case 1: // ver todos los coches
                    for (int i = 0; i < COCHES.length; i++){
                        System.out.println(i + " : " + COCHES[i]);
                    }
                    break;
                case 2: // filtrar por marca
                    System.out.println("Introduce la marca");
                    String marca = SC.nextLine();
                    for (int i = 0; i < COCHES.length; i++){  
                        if (marca.equals(COCHES[i].getMarca())){
                            System.out.println(i + " : " + COCHES[i]);
                        }
                    }
                    break;
                case 3: // filtrar por presupuesto
                    System.out.println("Introduce tu presupuesto");
                    double dinero = SC.nextDouble();
                    for (int i = 0; i < COCHES.length; i++){  
                        if (dinero >= COCHES[i].getPrecio()){
                            System.out.println(i + " : " + COCHES[i]);
                        }
                    }
                    break;
                case 4: // Añadir coche
                    // System.out.println("Se va a crear un coche");
                    // System.out.println("Introduce la marca: ");
                    // String m1 = SC.nextLine();
                    // System.out.println("Introduce el modelo : ");
                    // String m2 = SC.nextLine();
                    // System.out.println("Introduce el precio");
                    // double precio = SC.nextDouble();
                    // Automovil c_nuevo = new Automovil(m1, m2, precio);

                    // Automovil [] coches_nuevos = new Automovil[COCHES.length + 1];
                    // // copio el array antiguo en el nuevo
                    // for (int i = 0; i < COCHES.length; i++){
                    //     coches_nuevos[i] = COCHES[i];
                    // }
                    // // añado el nuevo coche en la ultima posicion del nuevo array 
                    // coches_nuevos[COCHES.length] = c_nuevo; // coches_nuevos[coches_nuevos.length - 1] = c_nuevo;
                    // COCHES = coches_nuevos;
                    COCHES = anadirAuto(COCHES);
                    break;
                case 5: // Ordenar coches por precio de menor a mayor
                    Arrays.sort(COCHES);
                    for (int i = 0; i < COCHES.length; i++){
                        System.out.println(i + " : " + COCHES[i]);
                    }
                    break;
                default: seguir = false;
                break;
            }
        }
        

    }   


    public static Automovil[] anadirAuto(Automovil [] coches){
        System.out.println("Se va a crear un coche");
        System.out.println("Introduce la marca: ");
        String m1 = SC.nextLine();
        System.out.println("Introduce el modelo : ");
        String m2 = SC.nextLine();
        System.out.println("Introduce el precio");
        double precio = SC.nextDouble();
        Automovil c_nuevo = new Automovil(m1, m2, precio);

        Automovil [] coches_nuevos = new Automovil[coches.length + 1];
        // copio el array antiguo en el nuevo
        for (int i = 0; i < coches.length; i++){
            coches_nuevos[i] = coches[i];
        }
        // añado el nuevo coche en la ultima posicion del nuevo array 
        coches_nuevos[coches.length] = c_nuevo; // coches_nuevos[coches_nuevos.length - 1] = c_nuevo;
        return coches_nuevos;
    }
}

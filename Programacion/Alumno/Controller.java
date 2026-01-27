package DiaUno;

import java.util.Scanner;

public class Controller {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Alumno al1 = new Alumno("Vicente", "Fernandez");
        // al1.saludar();
        // Alumno al2 = new Alumno("Nico", "Miseria");
        // al2.saludar();

        // String apellido_2 = al2.getApellido();
        // System.out.println("El apellido de mi alumno 2 es : " + apellido_2);
        // al2.setApellido("Miendo");
        // apellido_2 = al2.getApellido();
        // System.out.println("El apellido de mi alumno 2 es : " + apellido_2);




        // CREAR 3 ALUMNOS POR TECLADO -> Y UNA VEZ CREADOS TODOS
        // DAR LA OPCION AL USUARIO DE 
        // 1 - VER TODOS LOS NOMBRES
        // 2 - VER TODOS LOS APELLIDOS

        Alumno [] alumnos = new Alumno[2];

        for (int i = 0; i < alumnos.length; i++){

            System.out.println("Introduce el nombre " + i);
            String n1 = SC.nextLine();
            System.out.println("Introduce el apellido " + i);
            String a1 = SC.nextLine();
            Alumno alumno1 = new Alumno(n1, a1);
            alumnos[i] = alumno1;
            System.out.println(alumno1);
            System.out.println(alumnos[i]);
        } 

        System.out.println("Quieres ver los nombres (1) o los apellidos (2)");
        int eleccion = SC.nextInt();
        SC.nextLine();
        if (eleccion == 1) {
            for (int i = 0; i < alumnos.length; i++){
                Alumno aux = alumnos[i];
                System.out.println(aux.getNombre());

                System.out.println("¿Quieres modificarlo? (y/n)");
                String res = SC.nextLine();
                if (res.equalsIgnoreCase("Y")){
                    String new_name = SC.nextLine();
                    aux.setNombre(new_name);
                    aux.saludar();
                }
            }
        }   
        else{
            for (int i = 0; i < alumnos.length; i++){
                Alumno aux = alumnos[i];
                System.out.println(aux.getApellido());

                System.out.println("¿Quieres modificarlo? (y/n)");
                String res = SC.nextLine();
                if (res.equalsIgnoreCase("Y")){
                    String new_name = SC.nextLine();
                    aux.setApellido(new_name);
                    aux.saludar();
                }
            }
        }
    }
}

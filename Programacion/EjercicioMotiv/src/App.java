import java.util.Scanner;

public class App {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean seguir = true;
        String [] habilidades = new String[1];
        habilidades [0]="Kamehameha";
        Personaje p1 = new Personaje("Noob", "Ninguno", 10, 0, habilidades);
        while (seguir==true) {
            System.out.println("+============================+");
            System.out.println("|          PERSONAJE         |");
            System.out.println("+============================+");
            System.out.println("|  1.- Nombre                |");
            System.out.println("|  2.- Categoria             |");
            System.out.println("|  3.- Vida                  |");
            System.out.println("|  4.- Nivel                 |");
            System.out.println("|  5.- Habilidades           |");
            System.out.println("|  6.- Añadir habilidad      |");
            System.out.println("|  7.- Personaje completo    |");
            System.out.println("|  8.- Salir                 |");
            System.out.println("+============================+");
            int decision = SC.nextInt();
            SC.nextLine();
            switch (decision) {
                case 1:
                    System.out.println(p1.getNombre());
                    System.out.println("Quieres cambiar tu nombre (s/n)");
                    String nombre = SC.nextLine();
                    if (nombre.equalsIgnoreCase("s")) {
                        System.out.println("Escribe tu nuevo nombre");
                        String n=SC.nextLine();
                        p1.setNombre(n);
                        System.out.println("El nombre se a cambiado el nombre exitosmente");
                    }
                    else{
                        System.out.println("No se a cambiado el nombre");
                    }
                    break;
                case 2:
                    System.out.println(p1.getCategoria());
                    System.out.println("Quieres cambiar tu categoria (s/n)");
                    String categoria = SC.nextLine();
                    if (categoria.equalsIgnoreCase("s")) {
                        System.out.println("Escribe tu nueva categoria");
                        String c=SC.nextLine();
                        p1.setCategoria(c);
                        System.out.println("El nombre se a cambiado la categoria exitosmente");
                    }
                    else{
                        System.out.println("No se a cambiado la categoria");
                    }
                    break;
                case 3:
                    System.out.println(p1.getVida());
                    System.out.println("Quieres cambiar tu vida (s/n)");
                    System.out.println("Escribe tu nueva cantidad vida");
                    String vida = SC.nextLine();
                    if (vida.equalsIgnoreCase("s")) {
                        int v=SC.nextInt();
                        p1.setVida(v);
                        System.out.println("El nombre se a cambiado la vida exitosmente");
                    }
                    else{
                        System.out.println("No se a cambiado la vida");
                    }
                    break;
                case 4:
                    System.out.println(p1.getNivel());
                    System.out.println("Quieres cambiar tu nivel (s/n)");
                    System.out.println("Escribe tu nuevo nivel");
                    String nivel = SC.nextLine();
                    if (nivel.equalsIgnoreCase("s")) {
                        int lvl=SC.nextInt();
                        p1.setNivel(lvl);
                        System.out.println("El nombre se a cambiado el nivel exitosmente");
                    }
                    else{
                        System.out.println("No se a cambiado el nivel");
                    }
                    break;
                case 5:
                    p1.verHabilidades();
                    break;
                case 6:
                    System.out.println("¿Cual es tu nueva habilidad?");
                    String habilidad=SC.nextLine();
                    p1.añadirHabilidad(habilidad);
                    System.out.println("Has aprendido la habilidad "+habilidad);
                    break;
                case 7:
                    System.out.println(p1);
                    break;
                case 8:
                    seguir=false;
                    break;
            }
        }
    }
}

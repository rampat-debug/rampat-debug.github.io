import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner SC = new Scanner(System.in); 
    public static void main(String[] args) throws Exception {
        Jugador [] equipo = new Jugador[5];
        /* equipo[0]=new Jugador("Nico", 10, Posicion.PIVOT);
        equipo[1]=new Jugador("Nacho", 5, Posicion.CIERRE);
        equipo[2]=new Jugador("Argie", 1, Posicion.PORTERO);
        equipo[3]=new Jugador("Allyson", 2, Posicion.ALA);
        equipo[4]=new Jugador("Miguel", 14, Posicion.ALA); */
        System.out.println("¿Como se llama tu equipo?");
        String n_equipo=SC.nextLine();
        for(int i=0;i<equipo.length;i++){
            System.out.println("Jugador numero "+(i+1));
            equipo[i]=new Jugador(null, 0, null);
            System.out.print("Nombre del jugador: ");
            String nombre=SC.nextLine();
            equipo[i].setNombre(nombre);
            System.out.print("Dorsal del jugador: ");
            boolean reptido=true;
            while (reptido==true) {
               int numero=SC.nextInt();
                SC.nextLine();
                for(int j=0;j<i;j++){
                    if (numero==equipo[j].getNumero()) {
                        System.out.println("Ya estan usando ese numero");
                        reptido=false;
                        break;
                    }
                    equipo[i].setNumero(numero);
                } 
            }
           /* do {
               int numero=SC.nextInt();
                SC.nextLine();
                for(int j=0;j<i;j++){
                    if (numero==equipo[j].getNumero()) {
                        System.out.println("Ya estan usando ese numero");
                        reptido=false;
                        break;
                    }
                    equipo[i].setNumero(numero);
                } 
            } while (reptido==true); */
            System.out.print("Posicion del jugador (portero - cierre - ala - pivot): ");
            String posicion=SC.nextLine();
            equipo[i].setPosicion(Posicion.valueOf(posicion.toUpperCase()));
        }
        Arrays.sort(equipo);
        System.out.println(n_equipo);
        for(int i=0;i<equipo.length;i++){  
            System.out.println(equipo[i]);
        }
    }
}

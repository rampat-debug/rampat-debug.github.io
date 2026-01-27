import java.util.Scanner;

public class MasterMind {

    static int [] COMB_GANADORA = new int[4];
    static int INTENTOS;
    static int [][] TABLA_INTENTOS;
    static int N_OPCIONES;

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------");
        System.out.println("Bienvenido a MASTERMIND");
        System.out.println("-----------------------");
        System.out.println("¿Cuantas opciones quieres que haya?");
        N_OPCIONES = SC.nextInt();
        System.out.println("¿Cuantos intentos quieres tener?");
        INTENTOS = SC.nextInt();
        System.out.println("-----------------------");
        System.out.println("Preparando el juego....");
        System.out.println("-----------------------");
        TABLA_INTENTOS = new int[INTENTOS][4];

        crearCombinacionGanadora();
        revelarCombinacionGanadora();
        System.out.println();
        int turno = 0;
        boolean ganar = false;

        while (ganar == false && turno < INTENTOS){
            anadirIntento(turno);
            ganar = comprobarTurno(turno);
            mostrarIntentos(turno); 
            turno++;
        }

        if (ganar == false){
            System.out.println("Has perdido.....");
            revelarCombinacionGanadora();
        }
        else {
            System.out.println("Has ganado hehe.");
        }
    }

    private static void crearCombinacionGanadora(){

        for (int i = 0; i < COMB_GANADORA.length; i++){
            COMB_GANADORA[i] = (int)(Math.random()*N_OPCIONES + 1);
        }

    }

    private static void revelarCombinacionGanadora(){
        
        System.out.println("La combinacion ganadora es : ");
        System.out.print(" ---> ");
        for (int i = 0; i < COMB_GANADORA.length; i++){
            if (i != COMB_GANADORA.length - 1){
                System.out.print(COMB_GANADORA[i] + " - ");
            }
            else{
                System.out.print(COMB_GANADORA[i]);
            }
        }

    }

    private static void anadirIntento(int turno){

        System.out.println("Turno : " + turno);

        for (int i = 0; i < TABLA_INTENTOS[0].length; i++){

            System.out.println("Introduce el valor de la posicion : " + i);
            int v = SC.nextInt();

            while (v < 1 || v > N_OPCIONES){
                System.out.println("Introduce el valor de la posicion : " + i);
                v = SC.nextInt();
            }

            TABLA_INTENTOS[turno][i] = v;
        }

    }

    public static void mostrarIntentos(int intentos){

        for (int i = 0; i <= intentos; i++){
            System.out.print(" " + i + " ---> ");
            for(int j = 0; j < TABLA_INTENTOS[0].length; j++){
                if (j != TABLA_INTENTOS[0].length - 1){
                    System.out.print(TABLA_INTENTOS[i][j] + " - ");
                }
                else{
                    System.out.print(TABLA_INTENTOS[i][j]);
                }            
            }
            System.out.println();
        }

    }

    private static boolean comprobarTurno(int turno){
        // devuelvo true si he ganado
        // sino, digo cuantos están bien y devuelvo false

        boolean victoria = false;
        int aciertos = 0;
        int fuera_posicion = 0;

        // for (int i = 0; i < TABLA_INTENTOS[0].length; i++){
        //     if (TABLA_INTENTOS[turno][i] == COMB_GANADORA[i]){
        //         aciertos++;
        //     }
        // }

        for (int i = 0; i < TABLA_INTENTOS[0].length; i++){
            for (int j = 0; j < COMB_GANADORA.length; j++){
                if (TABLA_INTENTOS[turno][i] == COMB_GANADORA[j]){                    
                    if (i == j){
                        aciertos++;
                    }
                    else{
                        fuera_posicion++;
                    }
                    break;
                }
            }
        }

        if (aciertos == 4){
            victoria = true;
        }
        else{
            System.out.println("Has acertado " + aciertos + " posiciones.");
            System.out.println("Hay " + fuera_posicion + " fuera de su posicion.");
        }
        return victoria;
    }
}

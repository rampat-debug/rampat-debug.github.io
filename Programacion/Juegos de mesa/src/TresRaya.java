import java.util.Scanner;
public class TresRaya{
    static int N_TURNOS = 8;
    final static char VACIO = '_';
    final static char FICHA_X = 'X';
    final static char FICHA_O = 'O';
    static Scanner SC = new Scanner(System.in);
    static char [][] TABLERO = { {VACIO, VACIO, VACIO},
                                 {VACIO, VACIO, VACIO},
                                 {VACIO, VACIO, VACIO} };
    public static void main(String[] args) {
        System.out.println("----- Empieza el juego -----");
        imprimirTablero();
        boolean ganar = false;
        while (N_TURNOS > 0 && ganar == false){
            if(N_TURNOS % 2 == 0){
                System.out.println("Turno del jugador : " + FICHA_X);
                ponerFicha(FICHA_X);
                imprimirTablero();
            }
            else{
                System.out.println("Turno del jugador : " + FICHA_O);
                ponerFicha(FICHA_O);
                imprimirTablero();
            }
            N_TURNOS--;
        }
    }
    private static void imprimirTablero(){
        for (int i=0;i<TABLERO.length; i++){
            for (int j=0;j<TABLERO[0].length; j++){
                System.out.print(TABLERO[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void ponerFicha(char ficha){
        // pone la ficha en la posicion del tablero
        // si la fila no existe, se vuelve a pedir.
        // si la columna no existe, se vuelve a pedir
        // SI la posicion esta ocupada, te lo dice, y se vuelve a pedir.
        boolean ocupada = false;
        while (ocupada == false){
            System.out.print("Por favor introduce la fila: ");
            int fila = SC.nextInt();
            while (fila > 2 || fila < 0){
                System.out.print("Fila incorrecta, por favor introduce una fila: ");
                fila = SC.nextInt();
            }
            System.out.print("Introduce la columna : ");
            int columna = SC.nextInt();

            if (TABLERO[fila][columna] == VACIO){
                TABLERO[fila][columna] = ficha;
                ocupada = true;
            }
            else{
                System.out.println("Ya hay una ficha ahí");
            }   
        }
    }
}
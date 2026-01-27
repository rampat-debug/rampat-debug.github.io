import java.util.Scanner;

public class App {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String [] historial=new String[0];
        Calc miCalc = new Calc(historial);
        Boolean seguir=true;
        while (seguir==true) {
            System.out.println("+=============================+");
            System.out.println("|          CALCULADORA        |");
            System.out.println("+=============================+");
            System.out.println("|  1.- Decimal -> Binario     |");
            System.out.println("|  2.- Binario -> Decimal     |");
            System.out.println("|  3.- Ver historial          |");
            System.out.println("|  4.- Salir                  |");
            System.out.println("+=============================+");
            int opcion=SC.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce tu numnero decimal-> ");
                    int decimal=SC.nextInt();
                    System.out.println(miCalc.decimalBinario(decimal));
                    miCalc.historial(decimal+" ---> "+miCalc.decimalBinario(decimal));
                    break;
                case 2:
                    System.out.print("Introduce tu numnero binario-> ");
                    SC.nextLine();
                    String binario=SC.nextLine();
                    System.out.println(miCalc.binarioDecimal(binario));
                    miCalc.historial(binario+" ---> "+miCalc.binarioDecimal(binario));
                    break;
                case 3:
                    miCalc.verHistorial();
                    break;
                case 4:
                    seguir=false;
                    break;
                default:
                    break;
            }
        }
    }
}

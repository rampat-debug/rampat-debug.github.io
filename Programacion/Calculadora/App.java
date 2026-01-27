import java.util.Scanner;

public class App {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        Calc miCalc = new Calc();

        System.out.println("Introduce un numero para pasarlo a binario: ");
        int numero = SC.nextInt();
        SC.nextLine();
        String numero_binario = miCalc.decToBin(numero);
        System.out.println("---> " + numero_binario);

        System.out.println("Introduce un numero para pasarlo a decimal: ");
        String numero2 = SC.nextLine();
        int numero_decimal = miCalc.binToDec(numero2);
        System.out.println("---> " + numero_decimal);
    }
}

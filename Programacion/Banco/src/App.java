import java.util.Scanner;

public class App {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CuentaCorriente tarjeta = new CuentaCorriente("Juan", "Perez", "Y9173710A", "Sol, 3", 87732123, 1462.43);
        CuentaCorriente tarjeta1 = new CuentaCorriente("Claudia", "Mercedes", "X6783425D", "Calla, 45", 457234124, 76234.03);
        CuentaCorriente tarjeta2 = new CuentaCorriente("Jose", "Torres", "A8972349E", "Noviciado, 7", 987423412, 112323.45);
        CuentaCorriente tarjeta3 = new CuentaCorriente("Carlos", "Castaño", "B8273444P", "Santo Domingo, 1", 932341334, 2134.23);
        CuentaCorriente [] cuentas= {tarjeta,tarjeta1,tarjeta2,tarjeta3};
        boolean seguir=true;
        System.out.println("Iniciar sesion");
        System.out.print("DNI: ");
        String dni=SC.nextLine();
        boolean encontrado=false;
        for(int i=0;i<cuentas.length;i++){
            if (cuentas[i].getDni().equalsIgnoreCase(dni)) {
                encontrado=true;
                System.out.println("Hola, "+cuentas[i].getNombre()+" "+cuentas[i].getApellido());
                while (seguir==true) {
                    System.out.println("+-----------------------------------+");
                    System.out.println("|               BANCO               |");
                    System.out.println("+-----------------------------------+");
                    System.out.println("|  1.- Sacar dinero                 |");
                    System.out.println("|  2.- Ingresar dinero              |");
                    System.out.println("|  3.- Consultar saldo              |");
                    System.out.println("|  4.- Modificar datos personales   |");
                    System.out.println("|  5.- Terminar                     |");
                    System.out.println("+-----------------------------------+");
                    int decision=SC.nextInt();
                    SC.nextLine();
                    switch (decision) {
                        case 1:
                            System.out.print("Cantidad a sacar: ");
                            double saldo=SC.nextDouble();
                            SC.nextLine();
                            cuentas[i].sacarDinero(saldo);
                            break;
                        case 2:
                            System.out.print("Cantidad a ingresar: ");
                            double dinero=SC.nextDouble();
                            SC.nextLine();
                            cuentas[i].ingresarDinero(dinero);
                            break;
                        case 3:
                            cuentas[i].mostarDinero();
                            break;
                        case 4:
                            cuentas[i].modificarDatos();
                            break;
                        case 5:
                            seguir=false;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if (encontrado==false) {
            System.out.println("La cuenta no existe");
        }
    }
}
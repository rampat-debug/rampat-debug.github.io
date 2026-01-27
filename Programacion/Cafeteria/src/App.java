import java.util.Scanner;

public class App {
    static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, Epstein-chan!");
        Cafe solo= new Cafe();
        Cafe cafe_leche= new Cafe(true, true);
        Cafe cafe_solohieloazucar= new Cafe(true, true, false);
        Cafe[]cafes={solo, cafe_leche, cafe_solohieloazucar};
        //añadir un cafe con cada uno de los tres constructores
        for(int i=0;i<cafes.length;i++){
            System.out.println();
            if (i==0) {
                System.out.println((i+1)+". Cafe solo");
            }
            if (i==1) {
                System.out.println((i+1)+". Cafe con leche");
            }
            if (i==2) {
                System.out.println((i+1)+". Cafe solo con azucar y hielo");
            }
            System.out.println(cafes[i]);
        }
        System.out.println("¿Que cafe quieres?");
        int cafeElegido=SC.nextInt();
        SC.nextLine();
        System.out.println("¿Quieres un complemento?");
        System.out.println("Introduce el nombre del complemento, o NO si no quieres");
        String complemento=SC.nextLine();
        if (complemento.equalsIgnoreCase("no")) {
            System.out.println("Aqui tienes tu cafe");
            System.out.println(cafes[cafeElegido-1]);
        }
        else{
            cafes[cafeElegido-1].setComplemento(complemento);
            System.out.println("Aqui tienes tu cafe");
            System.out.println(cafes[cafeElegido-1]);
        }*/
        Cafe cafe_nuevo=new Cafe();
        System.out.println("¿Quieres leche? (s/n)");
        String r_leche=SC.nextLine();
        if (r_leche.equalsIgnoreCase("s")) {
            cafe_nuevo.setLeche(true);
            cafe_nuevo.setPrecio(cafe_nuevo.getPrecio()+0.10);
        }
        System.out.println("¿Quieres azucar? (s/n)");
        String r_azucar=SC.nextLine();
        if (r_azucar.equalsIgnoreCase("s")) {
            cafe_nuevo.setAzucar(true);
            cafe_nuevo.setPrecio(cafe_nuevo.getPrecio()+0.10);
        }
        System.out.println("¿Quieres hielo? (s/n)");
        String r_hielo=SC.nextLine();
        if (r_hielo.equalsIgnoreCase("s")) {
            cafe_nuevo.setHielo(true);
            cafe_nuevo.setPrecio(cafe_nuevo.getPrecio()+0.10);
        };
        System.out.println("¿Quieres complementos? (s/n)");
        String r_complemento=SC.nextLine();
        if (r_complemento.equalsIgnoreCase("s")) {
            System.out.println("Escribe el/los complementos");
            String complemento=SC.nextLine();
            cafe_nuevo.setComplemento(complemento);
            cafe_nuevo.setPrecio(cafe_nuevo.getPrecio()+0.10);
        }
        System.out.println("Aqui tienes tu cafe");
        System.out.println(cafe_nuevo);
        System.out.println("Precio: "+cafe_nuevo.getPrecio()+"$");
    }
}

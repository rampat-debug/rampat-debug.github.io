public class Calc {
    // constructor vacio -> no tengo atributos
    public Calc(){}

    // metodos.
    public String decToBin(int num){
        // quiero dividir entre 2 hasta que el cociente sea 1 (o 0) --> < 2
        String binario = "";

        while (num >= 2){
            int resto = num % 2;
            num = num / 2;
            binario = resto + binario;
        }
        binario = num + binario;

        return binario;
        // int numero_bin = Integer.parseInt(binario);
        // return numero_bin;
    }

    public int binToDec(String num){

        int resultado = 0;
        for (int i = 0; i < num.length(); i++){

            char c = num.charAt(i);
            if (c == '1'){
                resultado = resultado + (int)(Math.pow(2, num.length() - 1 - i));
            }

        }
        return resultado;
    }
}

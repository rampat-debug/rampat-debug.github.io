public class Calc {
    private String [] operacion;
    public Calc(String[] operacion) {
        this.operacion = new String[0];
    }
    public String[] getOperacion() {
        return operacion;
    }
    public void calculadora(){

    }
    public String decimalBinario(int numero){
        String binario="";
        while (numero>=2) {
            int resto=numero%2;
            numero=numero/2;
            binario=resto+binario;
        }
        //int numero_bin=Integer.parseInt(binario);
        binario=numero+binario;
        return binario;
    }
    public int binarioDecimal(String numero){
        int num=0;
        for(int i=0;i<numero.length();i++){
            int binario=Integer.parseInt(numero.charAt(i)+"");
            int decimal=binario*(int)Math.pow(2, numero.length()-i-1);
            num=decimal+num;
        }
        return num;
    }
    public void historial(String op){
        String [] nuevo= new String[this.operacion.length+1];
        for(int i=0;i<this.operacion.length;i++){
            nuevo[i]=this.operacion[i];
        }
        nuevo[this.operacion.length]=op;
        this.operacion=nuevo;
    }
    public void verHistorial(){
        for(int i=0;i<this.operacion.length;i++){
            System.out.println(this.operacion[i]);
        }
    }
}

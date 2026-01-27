public class Automovil implements Comparable<Automovil>{
   
    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String marca, String modelo, double precio){

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return this.marca + " : " + this.modelo + "\n" + this.precio + "e";
    }

    @Override
    public int compareTo(Automovil coche2) {
        
        if (this.precio < coche2.getPrecio()){
            return -1;
        }
        else if (this.precio > coche2.getPrecio()){
            return +1;
        }
        else{
            return 0;
        }
    }



}


public class Jugador implements Comparable<Jugador>{
    String nombre;
    int numero;
    Posicion posicion;
    public Jugador(String nombre, int numero, Posicion posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "# "+this.numero+" : "+this.nombre+" - "+this.posicion;
    }
    @Override
    public int compareTo(Jugador jugador2) {
        if (this.numero<(jugador2.getNumero())) {
            return -1;
        }
        if (this.numero>(jugador2.getNumero())) {
            return 1;
        }
        return 0;
    }
}

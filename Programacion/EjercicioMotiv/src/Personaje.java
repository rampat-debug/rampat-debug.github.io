public class Personaje {
    private String nombre, categoria;
    private int vida, nivel;
    private String [] habilidades;
    public Personaje(String nombre, String categoria, int vida, int nivel) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.vida = vida;
        this.nivel = nivel;
        this.habilidades = new String[0];
    }
    public Personaje(String nombre, String categoria, int vida, int nivel, String[] habilidades) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.vida = vida;
        this.nivel = nivel;
        this.habilidades = habilidades;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void verHabilidades(){
        for(int i=0;i<this.habilidades.length;i++){
            System.out.println(this.habilidades[i]);
        }
    }
    public String [] añadirHabilidad(String habilidad){
        System.out.println("¿Que habilidad quieres aprender?");
        String [] nueva_habilidad = new String[this.habilidades.length+1];
        for(int i=0;i<this.habilidades.length;i++){
            nueva_habilidad[i]=this.habilidades[i];
        }
        nueva_habilidad[nueva_habilidad.length-1]=habilidad;
        this.habilidades=nueva_habilidad;
        return this.habilidades;
    }
@Override
public String toString() {
    return "- Nombre: "+this.nombre+"\n- Categoria: "+this.categoria+"\n- Vida: "+this.vida+"\n- Nivel: "+this.nivel;
}
}

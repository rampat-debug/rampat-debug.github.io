public class Cafe {
    private Boolean azucar, hielo, leche;
    private String complemento;
    private double precio;
    //1€ base + 10c todo lo que añadamos
    public Cafe() {
        this.azucar = false;
        this.hielo = false;
        this.leche = false;
        this.complemento="";
        this.precio=1.00;
    }
    public Cafe(Boolean azucar, Boolean leche) {
        this.azucar = azucar;
        this.leche = leche;
        this.hielo = false;
        this.complemento="";
        this.precio=1.00;
    }
    public Cafe(Boolean azucar, Boolean hielo, Boolean leche) {
        this.azucar = azucar;
        this.leche = leche;
        this.hielo = hielo;
        this.complemento="";
        this.precio=1.00;
    }
    public Boolean getAzucar() {
        return azucar;
    }
    public void setAzucar(Boolean azucar) {
        this.azucar = azucar;
    }
    public Boolean getHielo() {
        return hielo;
    }
    public void setHielo(Boolean hielo) {
        this.hielo = hielo;
    }
    public Boolean getLeche() {
        return leche;
    }
    public void setLeche(Boolean leche) {
        this.leche = leche;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        String hieloS="";
        String lecheS="";
        String azucarS="";
        if (this.complemento.equals("")) {
            this.complemento="\nComplementos: sin complementos";
        }
        else{
            this.complemento="\nComplementos: "+complemento;
        }
        if (this.hielo==false) {
            hieloS="\nHielo: sin hielo";
        }
        else{
            hieloS="\nHielo: con hielo";
        }
        if (this.leche==false) {
            lecheS="Leche: sin leche";
        }
        else{
            lecheS="Leche: con leche";
        }
        if (this.azucar==false){
            azucarS="\nAzucar: sin azucar";
        }
        else{
            azucarS="\nAzucar: con azucar";
        }
        return lecheS+azucarS+hieloS+this.complemento;
    }
}

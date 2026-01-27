public class Casilla {
    private boolean muro, visitada, inicio, fin;
    public Casilla(boolean muro, boolean visitada, boolean inicio, boolean fin) {
        this.muro = muro;
        this.visitada = visitada;
        this.inicio = inicio;
        this.fin = fin;
    }
    public boolean isMuro() {
        return muro;
    }
    public void setMuro(boolean muro) {
        this.muro = muro;
    }
    public boolean isVisitada() {
        return visitada;
    }
    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }
    public boolean isInicio() {
        return inicio;
    }
    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }
    public boolean isFin() {
        return fin;
    }
    public void setFin(boolean fin) {
        this.fin = fin;
    }
    @Override
    public String toString() {
        if (this.inicio) {
            return "I";
        }
        if (this.fin) {
            return "O";
        }
        if (this.muro) {
            return "█";
        }
        if (this.visitada) {
            return "»";
        }
        return " ";
    }
}

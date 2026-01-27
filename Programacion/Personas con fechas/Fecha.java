public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    public Fecha(int a1, int a2, int a3){
        if (a1 > 30 || a1 < 1){
            this.dia = 4;
        }
        else{
            this.dia = a1;
        }
        if (a2 > 12 || a2 < 1){
            this.mes = 12;
        }
        else{
            this.mes = a2;
        }
        this.ano = a3;
    }

    public Fecha(int d, int m){
        if (d > 30 || d < 1){
            this.dia = 4;
        }
        else{
            this.dia = d;
        }
        if (m > 12 || m < 1){
            this.mes = 12;
        }
        else{
            this.mes = m;
        }
        this.ano = 2025;
    }

    public Fecha(int d){
        if (d > 30 || d < 1){
            this.dia = 4;
        }
        else{
            this.dia = d;
        }
        this.mes = 12;
        this.ano = 2025;
    }

    public Fecha(){
        this.dia = 4;
        this.mes = 12;
        this.ano = 2025;
    }

    // getters
    public int getDia() {
        return dia;
    }
    
    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public String mostrarFechaUS(){
        return this.mes + "/" + this.dia + "/" + this.ano;
    }

    public String mostrarFechaCH(){
        return this.ano + "/" + this.mes + "/" + this.dia;
    }

    @Override
    public boolean equals(Object obj) {
        // casteo Objeto -> Fecha
        Fecha fecha2 = (Fecha)obj;
        Fecha fecha1 = this;

        int dia1 = fecha1.getDia();
        int dia2 = fecha2.getDia();

        int mes1 = fecha1.getMes();
        int mes2 = fecha1.getMes();

        int ano1 = fecha1.getAno();
        int ano2 = fecha2.getAno();

        if (dia1 == dia2 && mes1 == mes2 && ano1 == ano2){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esMayor(Fecha f2){
        // devuelve TRUE si la fecha que llama al metodo
        // es mayor que f2
        int ano1 = this.ano;
        int ano2 = f2.getAno();
        if (ano1 > ano2){
            return true;
        }
        else if(ano1 < ano2){
            return false;
        }
        else{
            int mes1 = this.mes;
            int mes2 = f2.getMes();
            if (mes1 > mes2){
                return true;
            }
            else if(mes1 < mes2){
                return false;
            }
            else{
                int dia1 = this.dia;
                int dia2 = f2.getDia();
                if(dia1 > dia2){
                    return true;
                }
                else{
                    return false;
                }
            }
        }   
    }

    public boolean esMenor(Fecha f2){
        return f2.esMayor(this);
    }

    
}
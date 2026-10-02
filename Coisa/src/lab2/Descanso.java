package lab2;
public class Descanso {
    private int horasDescanso;
    private int horasSemana;

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.horasSemana = valor;
    }

    public String getStatusGeral() {
        if (this.horasSemana == 0) {
            return "cansado";
        }
        if (this.horasDescanso / this.horasSemana >= 26) {
            return "descansado";
        }
        return "cansado";
    }


}

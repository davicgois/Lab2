package lab2;
public class Descanso {
    private int horasDescanso;
    private int horasSemana;

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int valor) {
        this.horasSemana = horasSemana;
    }

    public String getStatusGeral() {
        if (this.horasDescanso / this.horasSemana >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }


    }
}
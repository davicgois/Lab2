package lab2;
import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = new int[]{1,1,1,1};
        this.notas = new double[]{0,0,0,0};
    }


    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;

    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota == 1) {
            this.notas[0] = valorNota;

        } else if (nota == 2) {
            this.notas[1] = valorNota;

        } else if (nota == 3) {
            this.notas[2] = valorNota;

        } else if (nota == 4) {
            this.notas[3] = valorNota;
        }
    }

    public boolean aprovado(){
        if (calculaMedia() >= 7){
            return true;
        } else {
            return false;
        }

    }

    public double calculaMedia() {
        double media = 0;
        double sum = 0;
        for (int i = 0; i < this.pesos.length; i++) {
            sum += pesos[0] * notas[0];
        }
        media = sum / this.pesos.length;
        return media;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }

}

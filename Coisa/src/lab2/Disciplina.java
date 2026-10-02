package lab2;
import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;

    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota == 1) {
            this.nota1 = valorNota;

        } else if (nota == 2) {
            this.nota2 = valorNota;

        } else if (nota == 3) {
            this.nota3 = valorNota;

        } else if (nota == 4) {
            this.nota4 = valorNota;

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
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;


    }

    @Override
    public String toString() {
        double[] notas = {nota1, nota2, nota3, nota4};
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }

}

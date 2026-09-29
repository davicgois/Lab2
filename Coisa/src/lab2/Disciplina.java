package lab2;
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



    public double calculaMedia() {


    }
}
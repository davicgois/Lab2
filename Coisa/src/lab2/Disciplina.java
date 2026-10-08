package lab2;
import java.util.Arrays;

/**
 * Representação de uma disciplina paga por um estudante. Registra as horas de estudo e as notas da disciplina, calcula a média ponderada pelospesos das notas e indica se o estudante foi aprovado.
 * @author Davi
 */
public class Disciplina {

    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Total de horas de estudo acumuladas na disciplina.
     */
    private int horasEstudo;

    /**
     * Notas da disciplina. A nota 1 fica na posição 0
     */
    private double[] notas;

    /**
     * Peso de cada nota no cálculo da média, na mesma posição da nota
     * correspondente no array de notas.
     */
    private int[] pesos;


    /**
     * Constrói uma disciplina a partir do seu nome, com quatro notas de
     * mesmo peso. Toda disciplina começa sem horas de estudo e com todas
     * as notas zeradas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Constroi uma disciplina com uma quantidade de notas e o peso de cada
     * uma delas
     *
     * @param nomeDisciplina o nome da disciplina
     * @param numNotas a quantidade de notas da disciplina
     * @param pesos o peso de cada nota em ordem
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = new int[]{1,1,1,1};
        this.notas = new double[]{0,0,0,0};
    }


    /**
     * Adiciona horas de estudo ao total já registrado na disciplina.
     *
     * @param horas a quantidade de horas de estudo a adicionar
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;

    }


    /**
     * Cadastra o valor de uma nota. As notas são numeradas a partir de 1
     *
     * @param nota o número da nota, de 1 a 4
     * @param valorNota o valor da nota
     */
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


    /**
     * Indica se o estudante foi aprovado na disciplina, isto é, se a média
     * é de pelo menos 7,0.
     *
     * @return true se o estudante foi aprovado, false caso reprove
     */
    public boolean aprovado(){
        if (calculaMedia() >= 7){
            return true;
        } else {
            return false;
        }

    }


    /**
     * Calcula a média ponderada das notas da disciplina
     *
     * @return a média ponderada das notas
     */
    public double calculaMedia() {
        double media = 0;
        double sum = 0;
        for (int i = 0; i < this.pesos.length; i++) {
            sum += pesos[0] * notas[0];
        }
        media = sum / this.pesos.length;
        return media;
    }


    /**
     * @return a representação em String da disciplina
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }

}

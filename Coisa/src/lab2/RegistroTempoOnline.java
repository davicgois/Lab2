package lab2;
/**
 * Registro do tempo online dedicado a uma disciplina
 * comparado com o tempo esperado para ela.
 *
 * @author Davi
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina
     */
    private String nomeDisciplina;

    /**
     * Total de horas online já usadas com a disciplina
     */
    private int tempoOnlineUsado;

    /**
     * Quantidade de horas online esperada para a disciplina
     */
    private int tempoOnlineEsperado;


    /**
     * Contrutor de um registro a partir do nome da disciplina, com o tempo
     * online esperado padrão de 120 horas. Todo registro começa sem tempo
     * online usado.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);

    }


    /**
     * Constroi um registro a partir do nome da disciplina e do tempo online
     * esperado para ela. Todo registro começa sem tempo online usado.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado a quantidade de horas online esperada
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }


    /**
     * Adiciona horas ao tempo online da disciplina.
     *
     * @param tempo a quantidade de horas online a adicionar
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;

    }


    /**
     * Indica se o tempo online usado já atingiu o tempo esperado para a
     * disciplina
     *
     * @return true se o tempo usado for maior ou igual ao esperado, ou false se for menor
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnlineUsado >= this.tempoOnlineEsperado){
            return true;

        } else {
            return false;
        }

    }


    /**
     * Retorna a String que representa o registro.
     *
     * @return a representação em String do registro de tempo online
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
    }

}
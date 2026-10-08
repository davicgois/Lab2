package lab2;

/**
 * um resumo de estudo: um pequeno texto.
 * O tema identifica o resumo dentro de um registro
 * de resumos.
 *
 * @author Davi
 */
public class Resumo {
    /**
     * Tema do resumo.
     */
    private String tema;


    /**
     * Conteúdo do resumo.
     */
    private String conteudo;


    /**
     * Constrói um resumo a partir do seu tema e conteúdo.
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * @return o tema do resumo
     */
    public String getTema() {
        return tema;
    }


    /**
     * @return o conteúdo do resumo
     */
    public String getConteudo() {
        return conteudo;
    }
}
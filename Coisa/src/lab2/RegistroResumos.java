package lab2;
import java.util.Arrays;
/**
 * Registro de resumos de estudo com capacidade limitada. Quando o registro
 * está cheio, um novo resumo substitui o mais antigo, seguindo a ordem de
 * cadastro. O registro não guarda dois resumos com o mesmo tema.

 */
public class RegistroResumos {

    /**
     * Resumos armazenados
     */
    private Resumo[] resumos;

    /**
     * Quantidade de resumos armazenados no momento
     */
    private int quantidadeAtual;


    /**
     * Posição em que o próximo resumo novo será colocado, sendo usado como indice. Volta a 0 ao
     * atingir o limite, para que o resumo mais antigo seja substituído.
     */
    private int proximoIndice;

    /**
     * Quantidade máxima de resumos que o registro pode armazenar.
     */
    private int limite;


    /**
     * Constrói um registro vazio, quee armazena até a quantidade de
     * resumos informada.
     *
     * @param numeroDeResumos a quantidade máxima de resumos do registro
     */
    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximoIndice = 0;
        this.quantidadeAtual = 0;
        this.resumos = new Resumo[numeroDeResumos];

    }


    /**
     * Procura a posição do resumo com o tema passado no parametro.
     *
     * @param tema o tema procurado
     * @return a posição do resumo no registro, ou -1 se não houver resumo
     *com esse tema
     */
    private int buscaIndice(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (tema.equals(this.resumos[i].getTema())) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Adiciona um resumo ao registro. Se já existir um resumo com o mesmo
     * tema, ele é substituído pelo novo, na mesma posiçao. Se o registro
     * estiver ocupado, o novo resumo entrara nesse indice
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public void adicionaResumo(String tema, String conteudo) {
        int indiceExistente = buscaIndice(tema);
        if (indiceExistente != -1) {
            this.resumos[indiceExistente] = new Resumo(tema, conteudo);
            return;
        }

        this.resumos[this.proximoIndice] = new Resumo(tema, conteudo);
        this.proximoIndice = (this.proximoIndice + 1) % this.limite;

        if (this.quantidadeAtual < this.limite) {
            this.quantidadeAtual++;
        }
    }


    /**
     * Retorna os resumos armazenados, na ordem das posições do registro.
     *Formato "Tema: Conteúdo".
     *
     * @return um array com a representação de cada resumo armazenado
     */
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return resultado;
    }


    /**
     * Retorna a quantidade de resumos armazenados no momento.
     *
     * @return a quantidade de resumos armazenados
     */
    public int contaResumo() {
        return quantidadeAtual;
    }


    /**
     * Indica se existe um resumo com o tema
     *
     * @param tema o tema procurado
     * @return true se houver um resumo com esse tema, false se nao tiver
     */
    public boolean temResumo(String tema) {
        return buscaIndice(tema) != -1;
    }


    /**
     * Retorna a String que representa o registro. A representação tem duas
     * linhas: a primeira no formato "- N resumo(s) cadastrado(s)" e a
     * segunda no formato "- Tema1 | Tema2 | ...".
     */
    public String imprimeResumos(){
        String listaTemas = "";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (i > 0) {
                listaTemas += " | ";
            }
            listaTemas += this.resumos[i].getTema();
        }
        return "- " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- " + listaTemas;
    }


    /**
     * Busca os resumos cujo conteúdo contém a chave informada
     *
     * @param chave o texto procurado no conteúdo dos resumos
     * @return os temas dos resumos encontrados, em ordem alfabética
     */
    public String[] busca(String chave) {
        int cont = 0;
        String chaveTratada = chave.toLowerCase();

        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.resumos[i].getConteudo().toLowerCase().contains(chaveTratada)) {
                cont++;
            }
        }


        String[] temasEncontrados = new String[cont];
        int indice = 0;
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.resumos[i].getConteudo().toLowerCase().contains(chaveTratada)) {
                temasEncontrados[indice] = this.resumos[i].getTema();
                indice++;
            }
        }

        Arrays.sort(temasEncontrados);

        return temasEncontrados;
    }

}
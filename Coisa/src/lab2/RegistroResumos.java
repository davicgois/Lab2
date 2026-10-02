package lab2;
public class RegistroResumos {

    private String[] temas;

    private String[] conteudos;

    private int quantidadeAtual;

    private int proximoIndice;

    private int limite;


    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximoIndice = 0;
        this.quantidadeAtual = 0;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];

    }

    private int buscaIndice(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (tema.equals(this.temas[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public void adicionaResumo(String tema, String conteudo) {
        int indiceExistente = buscaIndice(tema);
        if (indiceExistente != -1) {
            this.conteudos[indiceExistente] = conteudo;
            return;
        }
        this.temas[this.proximoIndice] = tema;
        this.conteudos[this.proximoIndice] = conteudo;

        this.proximoIndice = (this.proximoIndice + 1) % this.limite;


        if (this.quantidadeAtual < this.limite) {
            this.quantidadeAtual++;
        }
    }

    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resultado;

    }

    public int contaResumo() {
        return quantidadeAtual;
    }

    public boolean temResumo(String tema) {
        return buscaIndice(tema) != -1;
    }

    public String imprimeResumos(){
        String listaTemas = "";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (i > 0) {
                listaTemas += " | ";
            }
            listaTemas += this.temas[i];
        }
        return "- " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- " + listaTemas;
    }

}
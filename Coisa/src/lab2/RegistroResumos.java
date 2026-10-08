package lab2;
import java.util.Arrays;
public class RegistroResumos {

    private Resumo[] resumos;

    private int quantidadeAtual;

    private int proximoIndice;

    private int limite;

    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximoIndice = 0;
        this.quantidadeAtual = 0;
        this.resumos = new Resumo[numeroDeResumos];

    }

    private int buscaIndice(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (tema.equals(this.resumos[i].getTema())) {
                return i;
            }
        }
        return -1;
    }
    
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

    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
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
            listaTemas += this.resumos[i].getTema();
        }
        return "- " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- " + listaTemas;
    }

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
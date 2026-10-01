package lab2;
public class RegistroResumos {

    private int numeroDeResumos;

    private String[] temas;

    private String[] conteudos;

    private int quantidadeAtual;

    private int proximoIndice;

    private int limite;

    private String[] resumos;


    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximoIndice = 0;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];

    }

    public void adicionaResumo(String tema, String conteudo) {
        if (this.proximoIndice > this.limite){
            this.proximoIndice -= (this.limite + 1);
        }
        this.temas[this.proximoIndice] = tema;
        this.conteudos[this.proximoIndice] = conteudo;

        this.quantidadeAtual++;
        this.proximoIndice++;
    }

    public String[] pegaResumos() {

    }

    public int contaResumo() {
        return quantidadeAtual;
    }

    public boolean temResumo(String tema) {
        if (quantidadeAtual > 0){
            return true;
        } else {
            return false;
        }

    }

    public String imprimeResumos(){
        String concatenacao = "";
        for (int i = 0;i <= temas.length; i++){
            if (temas[i] != null){
                if (temas[i])
                concatenacao += temas[i] " |";
            }

        }
        return "-" + quantidadeAtual + " resumo(s) cadastrados(s)" + "\n" + "-" + ;
    }

}
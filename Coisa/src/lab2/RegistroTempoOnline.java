package lab2;
public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnlineUsado;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;

    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;

    }

    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnlineUsado >= this.tempoOnlineEsperado){
            return true;

        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return nomeDisciplina + "- " + tempoOnlineUsado + "-" + tempoOnlineEsperado +  "\n";
    }

}
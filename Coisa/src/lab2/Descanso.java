package lab2;
/**
 * Representação da rotina de descanso. Acompanha quantas
 * horas o estudante descansou ao longo de um número de semanas e a partir
 * da média semanal indica se ele está descansado ou cansado.
 *
 * @author Davi
 */
public class Descanso {
    /**
     * Total de horas de descanso registradas no período
     */
    private int horasDescanso;

    /**
     * Número de semanas do período em que as horas de descanso foram
     * contabilizadas. Enquanto não for definido, vale 0.
     */
    private int horasSemana;

    /**
     * Define o total de horas de descanso do período.
     *
     * @param valor a quantidade de horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o número de semanas do período.
     *
     * @param valor o número de semanas
     */
    public void defineNumeroSemanas(int valor) {
        this.horasSemana = valor;
    }


    /**
     * Retorna o estado do estudante. O estudante está
     * "descansado" se a média de horas de descanso por semana for de pelo
     * menos 26 horas. Caso contrário, ou se o número de semanas ainda não
     * tiver sido definido, está "cansado".
     *
     * @return "descansado" ou "cansado"
     */
    public String getStatusGeral() {
        if (this.horasSemana == 0) {
            return "cansado";
        }
        if (this.horasDescanso / this.horasSemana >= 26) {
            return "descansado";
        }
        return "cansado";
    }


}

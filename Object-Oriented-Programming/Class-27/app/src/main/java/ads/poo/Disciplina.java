package ads.poo;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }
    @Override
    public String toString() {
        return "Sigla: " + sigla + '\'' +
                "Dias: " + Arrays.toString(dias);
    }
}
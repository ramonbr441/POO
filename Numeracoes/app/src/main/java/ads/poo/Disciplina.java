package ads.poo;

import java.util.Arrays;

public class Disciplina {

    private String sigla;
    private DiasDaSemana[] diasDaSemana;

    public Disciplina(String sigla, DiasDaSemana[] diasDaSemana) {
        this.sigla = sigla;
        this.diasDaSemana = diasDaSemana;
    }

    @Override
    public String toString() {
        return "Sigla: "+  sigla + '\n' +
                "Dias: " + '\n' + "-"+ Arrays.toString(diasDaSemana) +
                '\n';
    }
}

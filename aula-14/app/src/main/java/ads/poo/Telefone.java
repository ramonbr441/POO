package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
        private String rotulo;
        private String valor;



    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;


    }
    public String formata( String valor) {
        String mascara = "+55 (##) #####−####";
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "rotulo:" + rotulo + '\n' +
                "Telefone:'" + formata(this.valor)
                ;
    }
}



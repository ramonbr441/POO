package ads.poo;

public class Email {

    private String rotulo;
    private String valor;
   private String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        if(valor.matches(eR)){
            this.valor = valor;
        }else{
            this.valor = " ";
        }
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
        return  "rotulo:" + rotulo + '\n' + "valor:" + valor ;
    }
}

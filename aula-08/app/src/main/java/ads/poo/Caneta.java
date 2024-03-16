package ads.poo;

public class Caneta {

    private String cor;
    private int tintaCaneta;

    public Caneta(String cor, int tintaCaneta) {
        this.cor = cor;
        this.tintaCaneta = tintaCaneta;
    }

    public Caneta(String cor ){

        this(cor,100);
    }

    public  Caneta (){

        this("vermelha", 100);
    }





    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTintaCaneta() {
        return tintaCaneta;
    }

    public void setTintaCaneta(int tintaCaneta) {
        this.tintaCaneta = tintaCaneta;
    }

    public String getSitucaoCaneta() {
        //TODO caneta não deenha sem tinta
        tintaCaneta --;

    return "desenhando na cor" + cor ;

    }
}

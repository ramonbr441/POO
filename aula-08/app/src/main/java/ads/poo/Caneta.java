package ads.poo;

public class Caneta {

    private String cor = "preta";
    private int tintaCaneta = 100;

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

package ads.poo;

public class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade =  velocidade;
    }

    @Override
    public String toString() {
        return
                " Minha vida é " + vida +
                " ,Meu ataque é " + ataque +
                " ,Minha velocidade é " + velocidade ;
    }
    public String andar(){
        return " andar";
    }


    public String atacar() {
        return " atacar";
    }

}

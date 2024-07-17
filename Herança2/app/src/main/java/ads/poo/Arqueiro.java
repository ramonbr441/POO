package ads.poo;

public class Arqueiro extends Personagem{


    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String andar(){
        return "Arqueiro " + super.andar();
    }
    public String Atacar(){
        return "Arqueiro " + super.atacar();
    }

    @Override
    public String toString() {
        return " eu sou um Arqueiro" + super.toString();
    }
}

package ads.poo;

public class Cavaleiro extends Personagem{


    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar(){
        return "Cavaleiro " + super.atacar();

    }

    public String andar(){
        return "Cavaleiro " + super.andar();
    }

    @Override
    public String toString() {
        return "eu sou um Cavaleiro "  + super.toString();
    }
}

package ads.poo;

public class carro {

    // atributos

    private double Velocidade;
    private String modelo;

    // metodo

    public void acelerar(double v){
        Velocidade+=v;
    }

    public double obterVelocidade(){
        return Velocidade;
    }

    public  void  freiar(double v){
        Velocidade-=v;

    }
}

package ads.poo;

import java.util.ArrayList;

public class AppGaragem {

    public static void main(String[] args) {

        Carro garagem = new Carro("rosa","LAMBO", new Motor(200,2000));

        ArrayList<Motor> estante = new ArrayList<>();

        estante.add(garagem.getMotor());
        garagem.setMotor(new Motor(400,2500));




        garagem = new Carro("branco","uno", new Motor(40,1000));

        System.out.println(garagem.getMotor());


    }

}

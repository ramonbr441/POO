
package ads.poo;

public class App {

    public static void main(String[] args) {

//        Buzz b = new Buzz();
//
//
//        System.out.println( b.isDisparolaser());
//
//        System.out.println("capacete aberto?" + b.isAbreCapcete());
//        b.abrirFecharCapacete();
//        System.out.println("capacete aberto?" + b.isAbreCapcete());
//
//        Buzz malvado = new Buzz();
//
//        System.out.println("capacete aberto?"  + malvado.isAbreCapcete() );


        Caneta c = new Caneta();

        c.setCor("verde");

        Pessoa takavara = new Pessoa();
        takavara.setCpf("121.560.649.46");
        takavara.setEmail("taka@gmail.com");
        takavara.setNome("takavara silva de sousa");


        System.out.println(takavara);



    }


}

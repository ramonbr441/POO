import java.util.Scanner;

public class Idade {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int nascimento;
        int ano;
        String nome;
        int idadeatual;

        Scanner teclado = new Scanner(System.in);

        System.out.print("entre com seu nome");
        nome = teclado.nextLine();

        System.out.print("entre com o ano de nascimento ");
        nascimento = teclado.nextInt();

        System.out.print("entre com o ano atual");
        ano = teclado.nextInt();

        idadeatual = ano - nascimento;

        System.out.println(nome + ", possui "+ idadeatual + "  anos" );

        teclado.close();





    }
}
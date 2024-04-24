package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivro {


    public static void main(String[] args) {
        HashMap<String,Livro> biblioteca = new HashMap<>();
        ArrayList<Autor>autoresDosLivros = new ArrayList<>();
        autoresDosLivros.add(new Autor("ramon","brasileiro"));
        autoresDosLivros.add(new Autor("thiaguinho","argentino"));

        Livro livro1 = new Livro("LivroTitulo1",100.50,autoresDosLivros,"29139821389");
        Livro livro2 = new Livro("LivroTitulo2",99.99,autoresDosLivros,"102390129023");


            biblioteca.put(livro1.getIsbn(),livro1);

        biblioteca.put(livro2.getIsbn(),livro2);

        Livro l = biblioteca.get(livro2.getIsbn());

        Livro l2 = biblioteca.get("000000011");

        if (l2 != null) {
            Autor outro = new Autor("outro", "br");
            l2.addAutor(outro);
        }





    }
}

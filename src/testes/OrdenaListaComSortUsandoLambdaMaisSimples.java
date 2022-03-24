package testes;

import java.util.ArrayList;
import java.util.List;

public class OrdenaListaComSortUsandoLambdaMaisSimples {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Ordena a lista.
        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));

        // Imprime a lista.
        System.out.println(palavras);

    }

}

package testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaListaComSortUsandoLambda {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Ordena a lista.
        palavras.sort((s1, s2) -> {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
        });

        // Imprime a lista.
        System.out.println(palavras);

    }

}

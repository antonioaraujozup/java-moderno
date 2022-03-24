package testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaListaComSort {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Declara o comparador.
        Comparador comparador = new Comparador();

        // Ordena a lista.
        palavras.sort(comparador);

        // Imprime a lista.
        System.out.println(palavras);

    }

}

class Comparador implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if (s1.length() < s2.length())
            return -1;

        if (s1.length() > s2.length())
            return 1;

        return 0;

    }

}

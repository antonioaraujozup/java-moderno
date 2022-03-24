package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImprimeListaComForEachUsandoLambda {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Imprime lista utilizando ForEach.
        palavras.forEach(s -> System.out.println(s));

    }

}
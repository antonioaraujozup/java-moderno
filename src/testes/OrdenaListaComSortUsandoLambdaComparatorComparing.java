package testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaListaComSortUsandoLambdaComparatorComparing {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Ordena a lista (lambda)
        palavras.sort(Comparator.comparing(s -> s.length()));

        // Ordena a lista (method reference)
        palavras.sort(Comparator.comparing(String::length));
        
        // Ordena a lista.
        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        // Ordena a lista (method reference)
        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        // Imprime a lista.
        System.out.println(palavras);

        // Imprime a lista com forEach e Method Reference.
        palavras.forEach(System.out::println);

    }

}

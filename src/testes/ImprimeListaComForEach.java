package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImprimeListaComForEach {

    public static void main(String[] args) {

        // Declara a lista.
        List<String> palavras = new ArrayList<>();

        // Preenche a lista.
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Declara o consumidor.
        Consumidor consumidor = new Consumidor();

        // Imprime lista utilizando ForEach.
        palavras.forEach(consumidor);

    }

}

class Consumidor implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}
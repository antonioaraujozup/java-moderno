package testes;

import model.Curso;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenaListaCursosLambdaMethodReference {

    public static void main(String[] args) {

        // Define a lista de cursos.
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // Ordena lista pela quantidade de alunos utilizando lambda.
        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

        // Imprime lista de cursos.
        cursos.forEach(c -> System.out.println(c.getNome()));

        // Ordena lista pela quantidade de alunos utilizando method reference.
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        // Imprime lista de cursos.
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("----------------------------------");

        // Imprime o nome dos cursos com mais de 50 alunos.
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .forEach(c -> System.out.println(c.getNome()));

        System.out.println("----------------------------------");

        // Cria um stream de string com o nome dos cursos e imprime.
        Stream<String> nomeCursos = cursos.stream().map(c -> c.getNome());
        nomeCursos.forEach(System.out::println);

        // Cria um stream de integer e imprime a quantidade de alunos de cursos com mais de 50 alunos.
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        // Filtra curso com mais de 50 alunos e pega o primeiro.
        Optional<Curso> optionalCurso = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findFirst();

        Curso curso = optionalCurso.orElse(null);
        System.out.println(curso.getNome());

        // Calcula a quantidade média de alunos dos cursos.
        OptionalDouble optionalMedia = cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        double media = optionalMedia.orElse(0);
        System.out.println("Média = " + media);

        // Cria nova lista com cursos com mais de 50 alunos.
        List<Curso> cursosMais50Alunos = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());

        cursosMais50Alunos.forEach(c -> System.out.println(c.getNome()));


    }

}

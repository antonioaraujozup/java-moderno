package testes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println("A data de hoje é: " + hoje);

        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        System.out.println("A data futura é: " + dataFutura);

        Period periodo = Period.between(hoje, dataFutura);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int anos = periodo.getYears();

        System.out.println("Período: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataHojeFormatada = LocalDate.now();
        System.out.println(dataHojeFormatada.format(formatador));

    }

}

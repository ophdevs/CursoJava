package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTIme {
    static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // criar formatacao
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").withZone(ZoneId.systemDefault()); // formatacao data e hora com fuso horario

        LocalDate ds1 = LocalDate.now(); //data atual da acao
        LocalDateTime ds2 = LocalDateTime.now(); // data e hora atual da ação
        Instant ds3 = Instant.now(); // data e hora exata com fuso idependente de onde roda

        LocalDate ds4 = LocalDate.parse("14-01-2026", fmt1);
        LocalDate ds5 = LocalDate.parse("14-01-2026 01:30", fmt2);

        LocalDate ds6 = LocalDate.of(2026, 9, 30);
        LocalDateTime ds7 = LocalDateTime.of(2026, 1, 14, 1, 34);

        System.out.println("ds1 = " + ds1);
        System.out.println("ds2 = " + ds2);
        System.out.println("ds3 = " + ds3);
        System.out.println("ds4 = " + ds4);
        System.out.println("ds5 = " + ds5);
        System.out.println("ds6 = " + ds6.format(fmt1)); //formatar para string
        System.out.println("ds7 = " + fmt2.format(ds7)); // outra forma de formatar



    }
}

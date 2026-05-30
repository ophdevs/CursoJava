package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterDateTime {
    public static void main(String[] args) {
        LocalDate ds1 = LocalDate.parse("2006-01-14");
        LocalDateTime ds2 = LocalDateTime.parse("2006-01-14T03:05");
        Instant ds3 = Instant.now();

        LocalDate d1 = LocalDate.ofInstant(ds3, ZoneId.systemDefault());
        LocalDateTime d2 = LocalDateTime.ofInstant(ds3, ZoneId.of("Portugal"));


        System.out.println("d1 =" + d1);
        System.out.println("d2 =" + d2);

        System.out.println("ds2 dia: " + ds2.getDayOfMonth()); // pegar o dia do mes
        System.out.println("ds2 mes: " + ds2.getMonthValue()); // pegar o valor do mes

    }
}

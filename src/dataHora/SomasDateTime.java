package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SomasDateTime {
    public static void main(String[] args) {
        LocalDate ds1 = LocalDate.parse("2006-01-14");
        LocalDate dsAtual = LocalDate.parse("2026-05-15");
        LocalDateTime ds2 = LocalDateTime.parse("2006-01-14T03:05");
        Instant ds3 = Instant.parse("2006-01-14T03:05:45Z");
        Instant ds4 = Instant.parse("2026-05-15T03:05:45Z");

        LocalDate soma = ds1.minusDays(7);
        LocalDate soma2= ds1.plusDays(7);


        Instant soma3 = ds3.minus(7, ChronoUnit.DAYS); // diminuiir com instant
        Instant soma4 = ds3.plus(7, ChronoUnit.DAYS); // somar com instant

        Duration t1 = Duration.between(ds3,ds4);

        Duration t2 = Duration.between(ds1.atTime(0,0),dsAtual.atTime(0,0)); // atTime usado para converter um LocalDate em um LocalDateTime
;

        System.out.println(soma);
        System.out.println(soma2);
        System.out.println(soma3);
        System.out.println(soma4);
        System.out.println( t1.toDays());
        System.out.println( t2.toDays());

    }
}

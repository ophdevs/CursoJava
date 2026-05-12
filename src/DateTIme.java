import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTIme {
    static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        LocalDate ds1 = LocalDate.now();
        LocalDateTime ds2 = LocalDateTime.now();
        Instant ds3 = Instant.now();

        LocalDate ds4 = LocalDate.parse("14-01-2026", fmt1);
        LocalDate ds5 = LocalDate.parse("14-01-2026 01:30", fmt2);

        LocalDate ds6 = LocalDate.of(2026, 9, 30);
        LocalDateTime ds7 = LocalDateTime.of(2026, 1, 14, 1, 34);

        System.out.println("ds1 = " + ds1);
        System.out.println("ds2 = " + ds2);
        System.out.println("ds3 = " + ds3);
        System.out.println("ds4 = " + ds4);
        System.out.println("ds5 = " + ds5);
        System.out.println("ds6 = " + ds6);
        System.out.println("ds7 = " + ds7);



    }
}

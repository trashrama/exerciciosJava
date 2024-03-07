import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;


public class Datas {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        System.out.println(data1);
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        Instant data3 = Instant.now();
        System.out.println(data3);

        data1 = LocalDate.parse("2023-10-10");
        System.out.println(data1);

    }
}

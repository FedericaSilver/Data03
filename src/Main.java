import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = data.getYear();
        Month month = data.getMonth();
        DayOfWeek day = data.getDayOfWeek();

        System.out.println("Data di partenza: " + data);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day of Week: " + day);


    }
}
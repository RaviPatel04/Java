import java.time.*;
import java.time.format.*;

public class _44DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m:s a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }
}


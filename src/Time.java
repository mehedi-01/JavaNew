import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:SS");

        String formatedTime = time.format(formatter);
        System.out.println("Time  = " +formatedTime);

    }
}

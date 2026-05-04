import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt + "Godina: " + dt.getYear() + ", Mjesec: " + dt.getMonth());
        System.out.println("Mjesec: " + dt.getMonth());
    }
}

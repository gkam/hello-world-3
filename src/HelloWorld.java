import java.time.format.*;
import java.time.*;

public class HelloWorld {
    public static void main(String args[]) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now) + "  : hello world Kabir");
    }
}

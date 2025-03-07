import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {
        System.out.println("GMT Time: " + ZonedDateTime.now(ZoneId.of("GMT")));
        System.out.println("IST Time: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("PST Time: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}

//Output
//GMT Time: 2025-03-07T14:16:28.559609500Z[GMT]
//IST Time: 2025-03-07T19:46:28.595365+05:30[Asia/Kolkata]
//PST Time: 2025-03-07T06:16:28.599364300-08:00[America/Los_Angeles]

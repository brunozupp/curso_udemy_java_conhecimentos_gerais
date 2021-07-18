package section11.trabalhandocomdatas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComCalendar {

    public static void executar() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);

        int month = cal.get(Calendar.MONTH);
        System.out.println(month); // vai de 0 a 11

    }
}

package section11.trabalhandocomdatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComDatasExecutar {

    public static void executar() throws ParseException {

        // Vai imprimir no horário do Brasil com 3 horas atrasadas
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Vai imprimir no formato UTC, sem as 3 horas atrasadas
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L); // para dar 5 da manhã


        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2017-06-25T15:42:07Z"));

        System.out.println("---------------------------------------");
        System.out.println("Agora = " + sdf2.format(x1));
        System.out.println("Agora em milisegundos = " + sdf2.format(x2));
        System.out.println("Passando com 0L = " + sdf2.format(x3));
        System.out.println("Para dar 5 AM = " + sdf2.format(x4));
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(y3));

        System.out.println("---------------------------------------");
        System.out.println("Agora = " + sdf3.format(x1));
        System.out.println("Agora em milisegundos = " + sdf3.format(x2));
        System.out.println("Passando com 0L = " + sdf3.format(x3));
        System.out.println("Para dar 5 AM = " + sdf3.format(x4));
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));
        System.out.println(sdf3.format(y3));
    }
}

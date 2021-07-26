package section19.exercicioset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class User {

    //private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private String name;
    private Date date;

    public User(String lineFromCSV) {

        String[] parts = lineFromCSV.split(" ");

        name = parts[0];
        date = Date.from(Instant.parse(parts[1]));

//        try {
//            date = sdf.parse(parts[1]);
//        } catch (ParseException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package section13.exerciciofixacao;

import section13.interfaces.BaseEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client implements BaseEntity {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public void show() {
        System.out.printf("Cliente = %s%nEmail = %s%nNascimento = %s%n",
                name,
                email,
                simpleDateFormat.format(birthDate)
        );
    }
}

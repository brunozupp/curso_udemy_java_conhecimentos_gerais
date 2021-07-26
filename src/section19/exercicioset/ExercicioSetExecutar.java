package section19.exercicioset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class ExercicioSetExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section19\\exercicioset\\log.txt";

        Set<User> users = new HashSet<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                // O adicionar vai verificar o hashCode e o equals para o name, e caso ainda não tenha um nome
                // igual, vai adicionar
                users.add(new User(line));
                line = br.readLine();
            }

            for (User user : users) {
                System.out.println(user.getName() + " - " + sdf.format(user.getDate()));
            }

            System.out.println("Total de " + users.size() + " Usuários");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package section20.exerciciostreamfixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamFixacaoExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section20\\exerciciostreamfixacao\\employees.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                employees.add(new Employee(line));
                line = br.readLine();
            }

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > 2000.0)
                    .map(e -> e.getEmail())
                    .sorted((e1,e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
                    .collect(Collectors.toList());

            for (String email : emails) {
                System.out.println(email);
            }

            Double sum = employees.stream()
                    .filter(e -> e.getName().startsWith("M"))
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("Soma dos salários que começam com M: " + sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

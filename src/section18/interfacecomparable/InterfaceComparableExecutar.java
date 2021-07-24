package section18.interfacecomparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparableExecutar {

    public static void executar() {

        exemplo2();
    }

    private static void exemplo1() {

        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section18\\interfacecomparable\\nomes.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String name = br.readLine();

            while(name != null) {
                list.add(name);
                name = br.readLine();
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void exemplo2() {

        List<Funcionario> funcionarios = new ArrayList<>();
        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section18\\interfacecomparable\\funcionarios.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                funcionarios.add(new Funcionario(line));

                line = br.readLine();
            }

            Collections.sort(funcionarios);

            for (Funcionario funcionario : funcionarios) {
                System.out.printf("Nome = %s - %.2f%n", funcionario.getName(), funcionario.getPrice());
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

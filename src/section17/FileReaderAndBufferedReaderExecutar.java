package section17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReaderExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\ UDEMY\\Java\\primeiro_programa\\src\\section17\\in.txt";

        try(
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr)
        ) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);

                // Se o arquivo estiver no final essa função retorna nulo
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

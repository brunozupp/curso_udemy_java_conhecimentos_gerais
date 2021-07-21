package section17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriterExecutar {

    public static void executar() {

        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good night"
        };

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section17\\out.txt";

        // Se eu passar o true como argumento não vai recriar o arquivo, mas adicionar ao final do mesmo
        //BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

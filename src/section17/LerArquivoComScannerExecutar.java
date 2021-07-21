package section17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivoComScannerExecutar {

    public static void executar() {

        File file = new File("C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section17\\in.txt");

        try(Scanner sc = new Scanner(file)) {

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

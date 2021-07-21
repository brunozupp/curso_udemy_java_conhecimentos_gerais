package section17.exerciciofixacao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivosExercicioFixacaoExecutar {

    public static void executar() {

        String pathItens = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section17\\exerciciofixacao\\itens.csv";

        List<Product> products = new ArrayList<>();

        readProductsFromCSV(products, pathItens);

        File fileAux = new File(pathItens);

        writeProductsToCSV(products, fileAux.getParent());

        printProductFromCSV(fileAux.getParent() + "\\out\\summary.csv");
    }

    private static void readProductsFromCSV(List<Product> products, String path) {
        try(
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
        ) {

            String line = br.readLine();

            while (line != null) {
                products.add(new Product(line));
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void writeProductsToCSV(List<Product> products, String pathFromItens) {

        File file = new File(pathFromItens + "\\out");

        if(!file.exists()) {
            file.mkdir();
        }

        String pathToSaveCSV = file.getPath() + "\\summary.csv";

        try(
                FileWriter fw = new FileWriter(pathToSaveCSV);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {

            for (Product product : products) {
                bw.write(product.toLineCSV());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printProductFromCSV(String path) {
        try(
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
        ) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

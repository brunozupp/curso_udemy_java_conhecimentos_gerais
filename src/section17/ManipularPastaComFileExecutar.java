package section17;

import java.io.File;

public class ManipularPastaComFileExecutar {

    public static void executar() {

        String folderPath = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src";

        File path = new File(folderPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder.getName());
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);

        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file.getName());
        }

        // Vai criar uma pasta
        boolean success = new File(folderPath + "\\section17\\subfolder").mkdir();
        System.out.println("Diretório criado com sucesso: " + (success ? "CRIADO" : "NÃO CRIADO"));
    }
}

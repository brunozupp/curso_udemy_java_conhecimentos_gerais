package section17;

import java.io.File;

public class InformacoesFileExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section17\\out.txt";

        File file = new File(path);

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
    }
}

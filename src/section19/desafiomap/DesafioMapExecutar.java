package section19.desafiomap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DesafioMapExecutar {

    public static void executar() {

        String path = "C:\\Users\\bruni\\Desktop\\Cursos\\UDEMY\\Java\\primeiro_programa\\src\\section19\\desafiomap\\votos.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<Candidato,Integer> map = new HashMap<>();

            String line = br.readLine();

            while(line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                Candidato candidato = new Candidato(name);

                if(map.containsKey(candidato)) {
                    map.put(candidato,map.get(candidato) + votes);
                } else {
                    map.put(candidato,votes);
                }

                line = br.readLine();
            }

            for (Candidato candidato : map.keySet()) {
                int votes = map.get(candidato);
                System.out.println(candidato.getName() + ": " + votes);
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

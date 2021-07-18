package section10.exerciciolista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioListaExecutar {

    public static void executar() {

        //List<String> list = new ArrayList<Integer>();
        // ou uma sintaxe mais limpa
        List<String> list = new ArrayList<>();

        list.add("Bruno");
        list.add("Maria");
        list.add("Carla");
        list.add("Roberto");
        list.add("Tiago");
        list.add("Tulho");
        list.add("Bernardo");
        list.add("Breno");
        list.add(2,"Luis");

        show2(list);

        list.remove("Carla");
        show2(list);
        list.remove(1);
        show2(list);

        list.removeIf(nome -> nome.startsWith("R"));
        show2(list);

        var index = list.indexOf("Bruno");
        System.out.println("Index of Bruno = " + index);
        System.out.println("----------------------------------");
        index = list.indexOf("Trator");
        System.out.println("Index of Trator = " + index);
        System.out.println("----------------------------------");

        List<String> result = list.stream().filter(nome -> nome.startsWith("B")).collect(Collectors.toList());

        show2(result);

        var filterNameBruno = list.stream().filter(
                nome -> nome.toLowerCase().equals("Bruno".toLowerCase()))
                .findFirst().orElse("Não encontrado");

        System.out.println("Filtro do Bruno = " + filterNameBruno);
        System.out.println("----------------------------------");

        filterNameBruno = list.stream().filter(
                nome -> nome.toLowerCase().equals("Joelma".toLowerCase()))
                .findFirst().orElse("Não encontrado");

        System.out.println("Filtra da Joelma = " + filterNameBruno);
        System.out.println("----------------------------------");

    }

    private static void show(List<String> list) {
        for(String nome : list) {
            System.out.println(nome);
        }
        System.out.println("----------------------------------");
    }
    private static void show2(List<String> list) {
        list.forEach(nome -> System.out.println(nome));
        System.out.println("----------------------------------");
    }

}

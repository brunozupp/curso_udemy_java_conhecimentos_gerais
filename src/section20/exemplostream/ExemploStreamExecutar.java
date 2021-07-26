package section20.exemplostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamExecutar {

    public static void executar() {
        exemploPipeline();
    }

    private static void examploStream() {
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        // Criar stream a partir de uma coleção
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // Criar stream a partir do Stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // Vai ao infinito
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // Chama o limit para limitar até 10 iterações

        // Fibonnaci
        // Sempre vai tá o par, aí usa o map para pegar a primeira posição
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] + x[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }

    private static void exemploPipeline() {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x,y) -> x + y);
        //int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
}

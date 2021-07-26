package section19.exemploset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSetExecutar {

    public static void executar() {

        exemplo2();
    }

    private static void exemplo1() {
        // HashSet não garante a ordem, mas é super rápido
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //System.out.println(set.contains("Notebook"));
        //set.remove("Tablet");
        //set.removeIf(o -> o.startsWith("N"));

        for (String p : set) {
            System.out.println(p);
        }
    }

    private static void exemplo2() {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // Union - Contém os dois
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("UNION");
        System.out.println(c);

        // Intersection - Contém o que tem em comum entre os dois conjuntos
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Intersection");
        System.out.println(d);

        // Difference - Remove o que tem em comum entre os dois conjuntos
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Difference");
        System.out.println(e);
    }
}

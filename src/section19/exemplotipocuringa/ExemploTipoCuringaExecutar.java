package section19.exemplotipocuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploTipoCuringaExecutar {

    public static void executar() {
        exemplo2();
    }

    private static void exemplo1() {

        // O supertipo de qualquer tipo de lista é o List<?>. Este é um tipo curinga
        List<?> myObjs = new ArrayList<>();

        // Se deixar esse Object vai da erro quando fazer myObjs = myNumbers; pois List<Object>
        // não é supertipo de lista
        //List<Object> myObjs = new ArrayList<>();

        List<Integer> myNumbers = new ArrayList<>();

        myObjs = myNumbers;
    }

    private static void exemplo2() {
        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
        printList(myStrs);
    }

    private static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

        // Não é possível adicionar valores a uma lista do tipo curinga
        // list.add(3);
    }
}

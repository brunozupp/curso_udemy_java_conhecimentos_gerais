package section6;

import java.util.ArrayList;
import java.util.List;

public class EstruturaFor {

    public static void executar() {

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        List<Integer> lista = new ArrayList<Integer>();
//        lista.add(1);
//        lista.add(2);
//        lista.add(3);
//        lista.add(4);
//        lista.add(5);
//        lista.add(6);
//        lista.add(7);
//
//        for(int item : lista) {
//            System.out.println(item);
//        }

        var x = 10;
        do {
            System.out.println(x);
            x -= 1;
        } while(x > 0);

    }
}

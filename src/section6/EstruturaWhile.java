package section6;

import java.util.Scanner;

public class EstruturaWhile {

    public static void executar() {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int total = x;

        while(x != 0) {

            x = sc.nextInt();
            total += x;
        }

        System.out.println("Valor é = " + total);
    }
}

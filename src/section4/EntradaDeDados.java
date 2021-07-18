package section4;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void executar() {

        Scanner sc = new Scanner(System.in);

//        String x = sc.nextLine();
//        System.out.println("O que foi digitado = " + x);
//
//        int inteiro = sc.nextInt();
//        System.out.println("O que foi digitado = " + inteiro);

        // Para poder usar o ponto e não vírgula ao digitar um número flutuante
        // O compilador do java pega a virgula por conta que minha máquina está
        // configurada para o português.
//        sc.useLocale(Locale.US);
//        double flutuante = sc.nextDouble();
//        System.out.println("O que foi digitado = " + flutuante);

//        char letra = sc.nextLine().charAt(0);
//        System.out.println("O que foi digitado = " + letra);

        int x;
        String s1,s2,s3;
        x = sc.nextInt();

        // Para consumir a quebra de linha e evitar o problema de pular o s1
        // assim limpa o buffer de leitura
        sc.nextLine();

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

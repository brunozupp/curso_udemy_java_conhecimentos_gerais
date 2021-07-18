package section7;

import java.util.Locale;

public class FuncoesString {

    public static void executar() {

        String original = "abcd FHGTF ABC ASDFfsdf     ";

        System.out.println(original);
        System.out.println(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim() + "-");
        System.out.println(original.substring(2));
        System.out.println(original.substring(2,9)); // O char da posição 9 não entra
        System.out.println(original.replace("a","Bruno"));
        System.out.println(original.indexOf("H"));
        System.out.println(original.indexOf("ABC"));

        String s = "potato apple lemon";
        String[] frutas = s.split(" ");
        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}

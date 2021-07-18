package section4;

import java.util.Locale;

public class SaidaDeDados {

    public static void executar() {

        double x = 10.43532;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);

        // Muda de virgula para ponto
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);

        System.out.println("Tamanho = " + x + " muito pequeno");
        System.out.printf("%.4f muito legal isso%n",x);

        String name = "Bruno";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",name,idade,renda);
    }
}

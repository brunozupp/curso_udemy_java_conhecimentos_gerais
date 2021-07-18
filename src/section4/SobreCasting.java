package section4;

public class SobreCasting {

    public static void executar() {

        int a,b;

        a = 5;
        b = 2;

        // Se não colocar o (double) vai arredondar o resultado
        double resultado = (double) a / b;

        System.out.println(resultado);
    }
}

package section7;

public class Funcoes {

    public static void executar() {

        System.out.println(max(5,4,3,7,1,45,65,3,2,1));
    }

    private static int max(int ...numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if(max < number) max = number;
        }

        return max;
    }
}

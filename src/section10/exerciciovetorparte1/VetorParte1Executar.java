package section10.exerciciovetorparte1;

public class VetorParte1Executar {

    public static void executar() {

        int length = 3;
        double[] vector = new double[length];
        vector[0] = 1.58;
        vector[1] = 1.97;
        vector[2] = 1.75;

        double sum = 0.0;

        for (int i = 0; i < length; i++) {
            sum += vector[i];
        }

        double average = sum / length;

        System.out.println(average);

    }
}

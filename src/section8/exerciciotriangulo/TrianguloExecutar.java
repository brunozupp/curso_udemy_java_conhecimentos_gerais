package section8.exerciciotriangulo;

public class TrianguloExecutar {

    public static void executar() {

        Triangulo x = new Triangulo(3.0,4.0,5.0);
        Triangulo y = new Triangulo(7.5,4.5,4.02);

        if(x.calcularArea() > y.calcularArea()) {
            System.out.println("X maior que Y");
        } else if(x.calcularArea() == y.calcularArea()) {
            System.out.println("Iguais");
        } else {
            System.out.println("Y é maior que X");
        }
    }
}

package section14.metodosabstratos;

import java.util.ArrayList;
import java.util.List;

public class MetodoAbstratoExecutar {

    public static void executar() {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(Color.BLACK, 3.0));
        shapes.add(new Rectangle(Color.RED, 4.0, 5.0));

        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}

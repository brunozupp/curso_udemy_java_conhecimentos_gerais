package section18.herdarinterface;

import section18.herdarinterface.model.entities.AbstractShape;
import section18.herdarinterface.model.entities.Circle;
import section18.herdarinterface.model.entities.Rectangle;
import section18.herdarinterface.model.entities.Shape;
import section18.herdarinterface.model.enums.Color;

public class HerdarInterfaceExecutar {

    public static void executar() {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}

package section18.problemaherancamultipla;

import section18.problemaherancamultipla.model.entities.ComboDevice;
import section18.problemaherancamultipla.model.entities.ConcretePrinter;
import section18.problemaherancamultipla.model.entities.ConcreteScanner;

public class ProblemaHerancamultiplaExecutar {

    public static void executar() {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}

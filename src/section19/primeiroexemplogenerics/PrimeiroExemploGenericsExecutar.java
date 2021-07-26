package section19.primeiroexemplogenerics;

public class PrimeiroExemploGenericsExecutar {

    public static void executar() {

        PrintService<String> ps = new PrintService<>();

        ps.addValue("Bruno");
        ps.addValue("Gustavo");
        ps.addValue("Roberto");

        System.out.println(ps.first());

        ps.print();
    }
}

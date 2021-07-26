package section19.exemploset;

import java.util.HashSet;
import java.util.Set;

public class ExemploSetIgualdadeExecutar {

    public static void executar() {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        // Por conta que foi implementado o hashCode e equals na classe Product a resposta
        // é 'true', pois vai estar comparando o valor dos atributos. Se não tivesse
        // implementado, seria comparado o valor do endereço / referência dos objetos
        // o que me retornaria 'false'
        System.out.println(set.contains(prod));
    }
}
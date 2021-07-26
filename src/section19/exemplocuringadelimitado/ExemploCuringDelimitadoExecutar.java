package section19.exemplocuringadelimitado;

import section19.exemplocuringadelimitado.entities.Circle;
import section19.exemplocuringadelimitado.entities.Rectangle;
import section19.exemplocuringadelimitado.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploCuringDelimitadoExecutar {

    public static void executar() {
        exemploPrincipioGetPut();
    }

    private static void exemploCuringaPermitindoSubtipo() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0,2.0));
        shapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(shapes));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(circles));
    }

    // Pode ser uma lista de Shape ou qualquer tipo que seja um subtipo de Shape
    // Porém eu não posso adicionar, pois os tipos podem ser incompatíveis
    private static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

    // Copia os elementos de uma lista para outra lista que pode ser mais genérica que a primeira
    // Covariância - Operação de Get funciona, mas a de Put (adicionar) não funciona por questão de não saber se o que quer adicionar corresponde ao tipo certo
    // Contravariância - Operação de Put funciona, mas de Get não funciona pois posso estar tentando armazenar um tipo indevido a uma variável de um determinado tipo
    private static void exemploPrincipioGetPut() {

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts,myObjs);

        printList(myObjs);

        copy(myDoubles,myObjs);

        printList(myObjs);
    }

    // Curinga com extends (Que seja um subtipo de Number) permite acessar o dado - Get
    // Curinga com o super (Nesse caso, um Number ou qualquer supertipo/pai de Number) permite adicionar o dado - Put
    private static void copy(List<? extends Number> source, List<? super Number> target) {
        for (Number number : source) {
            target.add(number);
        }
    }

    public static void printList(List<?> list) {
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void principioCovariancia() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);

        List<? extends Number> numbers = list;

        Number x = numbers.get(0);

        // Pode ser que o tipo 20 e 14.7 não seja um tipo válido do subtipo que foi passado para numbers, que no caso é a variável list
        // Já que o tipo 'verdadeiro' é o Integer, então seria válido só o 20, mas para evitar ele barra a operação de adicionar
        //numbers.add(14.7);
        //numbers.add(20);
    }

    private static void principioContravariancia() {
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        // Pode ser um Number ou qualquer supertipo de number (tanto Number quanto Object)
        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        // Da erro porque o elemento da posição pedido pode ser de um tipo diferente e não do tipo Number
        //Number x = myNums.get(0);
    }
}

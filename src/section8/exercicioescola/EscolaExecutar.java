package section8.exercicioescola;

import java.util.ArrayList;

public class EscolaExecutar {

    public static void executar() {

        Student[] students = {
                new Student("Bruno", 10,8,9,10),
                new Student("Pedro", 4,5,8,2),
                new Student("João", 1,2,3,4)
        };

        School school = new School("Lenarduzzi", students);

        System.out.println(school);
    }
}

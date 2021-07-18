package section8.exercicioescola;

import java.util.List;

public class School {

    private String name;
    private Student[] students;

    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    private String printStudents() {
        String print = "";

        for (Student student : students) {
            print += student.toString() + "\n";
        }

        return print;
    }

    @Override
    public String toString() {
        return "Escola = " + name +
                "\nalunos\n" + printStudents() +
                '}';
    }
}

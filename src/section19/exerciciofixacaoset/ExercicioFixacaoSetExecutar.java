package section19.exerciciofixacaoset;

import java.util.HashSet;
import java.util.Set;

public class ExercicioFixacaoSetExecutar {

    public static void executar() {

        Professor professor = new Professor("Bruno");

        Course course1 = new Course("Curso 1");
        Course course2 = new Course("Curso 2");
        Course course3 = new Course("Curso 3");

        Student student21 = new Student(21);
        Student student35 = new Student(35);
        Student student22 = new Student(22);
        Student student50 = new Student(50);
        Student student42 = new Student(42);
        Student student13 = new Student(13);

        course1.addStudent(student21);
        course1.addStudent(student35);
        course1.addStudent(student22);

        course2.addStudent(student21);
        course2.addStudent(student50);

        course3.addStudent(student42);
        course3.addStudent(student35);
        course3.addStudent(student13);

        professor.addCourse(course1);
        professor.addCourse(course2);
        professor.addCourse(course3);

        Set<Student> students = new HashSet<>();

        for (Course course : professor.getCourses()) {
            System.out.println("How many students for course: " + course.getName());
            for (Student student : course.getStudents()) {
                System.out.println(student.getId());
            }

            students.addAll(course.getStudents());
        }

        System.out.println("Total students: " + students.size());
    }
}

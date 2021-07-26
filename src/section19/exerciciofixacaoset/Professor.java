package section19.exerciciofixacaoset;

import java.util.HashSet;
import java.util.Set;

public class Professor {

    private String name;

    private Set<Course> courses = new HashSet<>();

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

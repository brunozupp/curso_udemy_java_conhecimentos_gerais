package section13.entities;

import section13.interfaces.BaseEntity;

public class Department implements BaseEntity {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Departamento = " + name);
    }
}

package section8.exercicioescola;

public class Student {

    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private double grade4;

    public Student(String name, double grade1, double grade2, double grade3, double grade4) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double getGrade4() {
        return grade4;
    }

    public double media() {
        return (grade1 + grade2 + grade3 + grade4) / 4.0;
    }

    public boolean isApproved() {
        return media() >= 7.0;
    }

    public double missingPointsToPass() {
        if(!isApproved()) {
            return 7.0 - media();
        }

        return 0.0;
    }

    @Override
    public String toString() {
        return "Aluno = " + name + " - Situação - " +
                (isApproved() ? "Aprovado" : "Reprovado") +
                " Média = " + String.format("%.2f", media()) +
                (!isApproved() ? String.format(" Falta %.2f para você passar", missingPointsToPass()) : "");
    }
}

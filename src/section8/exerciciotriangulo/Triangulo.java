package section8.exerciciotriangulo;

public class Triangulo {

    public double catetoA;
    public double catetoB;
    public double hiponetusa;

    public Triangulo(double catetoA, double catetoB, double hiponetusa) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hiponetusa = hiponetusa;
    }

    public double calcularPerimetro() {
        return (catetoA + catetoB + hiponetusa) / 2.0;
    }

    public double calcularArea() {
        double perimetro = calcularPerimetro();
        return Math.sqrt(perimetro * (perimetro - catetoA) * (perimetro - catetoB) * (perimetro - hiponetusa));
    }
}

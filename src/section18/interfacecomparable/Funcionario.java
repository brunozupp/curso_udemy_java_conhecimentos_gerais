package section18.interfacecomparable;

public class Funcionario implements Comparable<Funcionario> {

    private String name;
    private Double price;

    public Funcionario(String lineFromCSV) {
        String[] parts = lineFromCSV.split(",");

        this.name = parts[0];
        this.price = Double.parseDouble(parts[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Funcionario o) {
        // Compara pelo preço e volta na ordem crescente
        // return this.price.compareTo(o.price);

        // Compara pelo nome e volta na ordem decrescente
        // return changeResultCompareTo(this.name.compareTo(o.name));

        // Compara pelo nome e volta na ordem crescente
        //return this.name.compareTo(o.name);

        // Uma outra forma de retornar o valor decrescente, colocando o - antes
        return -this.name.compareTo(o.name);
    }

    private int changeResultCompareTo(int result) {
        return result * -1;
    }
}

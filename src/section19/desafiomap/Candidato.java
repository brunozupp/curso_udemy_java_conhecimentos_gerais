package section19.desafiomap;

import java.util.Objects;

public class Candidato {

    private String name;

    public Candidato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return name.equals(candidato.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

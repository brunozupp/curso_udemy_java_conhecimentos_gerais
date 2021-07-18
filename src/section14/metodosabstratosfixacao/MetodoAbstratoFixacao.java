package section14.metodosabstratosfixacao;

import java.util.ArrayList;
import java.util.List;

public class MetodoAbstratoFixacao {

    public static void executar() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new PessoaFisica("Bruno", 10000.0));
        pessoas.add(new PessoaFisica("Carlos", 50000.0, 2000.0));
        pessoas.add(new PessoaFisica("Roberto", 40000.0));
        pessoas.add(new PessoaJuridica("Noveli & CIA", 10000.0, 0));
        pessoas.add(new PessoaJuridica("Zupp & CIA", 400000.0, 25));

        for (Pessoa pessoa : pessoas) {
            System.out.printf("%s - %.2f%n", pessoa.getNome(), pessoa.calcularImposto());
        }
    }
}

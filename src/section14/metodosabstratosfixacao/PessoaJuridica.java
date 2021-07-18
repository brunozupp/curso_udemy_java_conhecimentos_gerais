package section14.metodosabstratosfixacao;

public class PessoaJuridica extends Pessoa {

    private Integer quantidadeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;

        if(quantidadeFuncionarios > 10) {
            imposto += (rendaAnual * 0.14);
        } else {
            imposto += (rendaAnual * 0.16);
        }

        return imposto;
    }
}

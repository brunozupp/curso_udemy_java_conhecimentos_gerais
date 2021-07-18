package section14.metodosabstratosfixacao;

public class PessoaFisica extends Pessoa {

    private Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosComSaude = 0.0;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;

        if(rendaAnual < 20000) {
            imposto += (rendaAnual * 0.15);
        } else {
            imposto += (rendaAnual * 0.25);
        }

        if(gastosComSaude > 0.0) {
            imposto -= (gastosComSaude * 0.5);
        }

        return imposto;
    }
}

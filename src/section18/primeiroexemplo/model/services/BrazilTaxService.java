package section18.primeiroexemplo.model.services;

public class BrazilTaxService implements TaxService {

    // Aqui uso tipo primitivo porque tenho em mente que sempre vou retornar um valor
    @Override
    public double tax(double amount) {
        if(amount <= 100.0) {
            return amount * 0.2;
        }

        return amount * 0.15;
    }
}

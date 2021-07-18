package section8.execiciometodosestaticos;

public class CurrencyCalculator {

    private static double IOF = 0.06;

    public static double buyDollar(double dollarPrice, double dollarBought) {

        double valueWithoutIOF = grossValueInReal(dollarPrice, dollarBought);

        return valueWithoutIOF + (valueWithoutIOF * IOF);
    }

    private static double grossValueInReal(double dollarPrice, double dollarBought) {
        return dollarPrice * dollarBought;
    }
}

package util;

public class CurrencyConverter {
    public static final double IOF=0.06;
    public static double dolarReal(double cotacao, double quant){
        return quant*cotacao+(quant*cotacao*IOF);

    }
}

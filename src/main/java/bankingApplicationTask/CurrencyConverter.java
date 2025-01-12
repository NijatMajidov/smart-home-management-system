package bankingApplicationTask;

import java.math.BigDecimal;

public class CurrencyConverter {

    public BigDecimal convert(BigDecimal amount, String fromCurrency, String toCurrency){
        if (!checkCurrency(fromCurrency) || !checkCurrency(toCurrency)) {
            throw new UnsupportedCurrencyException("Bu valyuta dəstəklənmir!");
        }
        BigDecimal conversionRate = getConversion(fromCurrency, toCurrency);
        return amount.multiply(conversionRate);
    }

    private boolean checkCurrency(String currency) {
        return currency.toUpperCase().equals(Currency.USD.toString()) || currency.toUpperCase().equals(Currency.EUR.toString())
                || currency.toUpperCase().equals(Currency.AZN.toString());
    }
    private BigDecimal getConversion(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(Currency.USD.toString()) && toCurrency.equals(Currency.EUR.toString())) {
            return BigDecimal.valueOf(0.9);
        } else if (fromCurrency.equals(Currency.USD.toString()) && toCurrency.equals(Currency.AZN.toString())) {
            return BigDecimal.valueOf(1.7);
        } else if (fromCurrency.equals(Currency.EUR.toString()) && toCurrency.equals(Currency.USD.toString())) {
            return BigDecimal.valueOf(1.1);
        } else if (fromCurrency.equals(Currency.EUR.toString()) && toCurrency.equals(Currency.AZN.toString())) {
            return BigDecimal.valueOf(1.9);
        } else if (fromCurrency.equals(Currency.AZN.toString()) && toCurrency.equals(Currency.USD.toString())) {
            return BigDecimal.valueOf(0.59);
        } else if (fromCurrency.equals(Currency.AZN.toString()) && toCurrency.equals(Currency.EUR.toString())) {
            return BigDecimal.valueOf(0.53);
        } else {
            return BigDecimal.ONE;
        }
    }
}
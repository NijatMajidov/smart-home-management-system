package bankingApplicationTask;

import java.math.BigDecimal;

public class MainApp {

    public static void main(String[] args) {

        try {
            BankAccount account = new BankAccount("123456789", BigDecimal.valueOf(500));

            try {
                account.withdraw(BigDecimal.valueOf(600));
            } catch (InsufficientBalanceException e) {
                System.err.println(e.getMessage());
            }


            CurrencyConverter converter = new CurrencyConverter();
            try {
                BigDecimal convertedAmount = converter.convert(BigDecimal.valueOf(100), "USD", "AZN");
                System.out.println("Çevrilmiş məbləğ: " + convertedAmount);
            } catch (UnsupportedCurrencyException e) {
                System.err.println(e.getMessage());
            }

            CustomerValidator validator = new CustomerValidator();
            try {
                validator.validateCustomer(null);
            } catch (InvalidCustomerException e) {
                System.err.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Bir xəta baş verdi: " + e.getMessage());
        }
    }
}
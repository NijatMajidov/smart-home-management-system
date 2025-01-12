package bankingApplicationTask;

public class CustomerValidator {
    public void validateCustomer(String customerName){
        if(customerName == null || customerName.trim().isEmpty()){
            throw new InvalidCustomerException("İstifadəçi adı düzgün deyil!");
        }
    }
}
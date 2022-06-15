package Adapter_Pattern;

public class Main_AdapterPattern {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());

    }
}

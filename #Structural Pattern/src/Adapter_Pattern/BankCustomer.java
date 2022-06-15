package Adapter_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{
    @Override
    public void giveBankDetails() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Account Holder Name: ");
            String Customer = bufferedReader.readLine();

            System.out.println("\nEnter Account Number: ");
            long accNo = Long.parseLong(bufferedReader.readLine());

            System.out.println("\nEnter Bank Name: ");
            String bankname = bufferedReader.readLine();

            setAccHolderName(Customer);
            setAccountNumber(accNo);
            setBankName(bankname);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        String accHolderName = getAccHolderName();
        long accNo = getAccountNumber();
        String bName = getBankName();

        return ("The account Number "+accNo+" of "+accHolderName+" in "+bName+"bank is valid and authenticated for issuing Credit Card.");

    }
}

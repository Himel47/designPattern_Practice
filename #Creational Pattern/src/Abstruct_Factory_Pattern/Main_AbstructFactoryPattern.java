package Abstruct_Factory_Pattern;

import Abstruct_Factory_Pattern.bank.*;
import Abstruct_Factory_Pattern.loan.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_AbstructFactoryPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Bank Name you want to take loan?");
        String bankName = bufferedReader.readLine();

        System.out.println("Enter Loan type:\nHomeLoan\nBusinessLoan\nEduactionalLoan?");
        String loanName = bufferedReader.readLine();

        AbstructFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.println("\nEnter interest rate for "+bank.getBankName()+": ");
        double rate = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Enter loanAmount you wanna take: ");
        double loanAmount = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Enter number of years to pay back entire Loan: ");
        int years = Integer.parseInt(bufferedReader.readLine());

        System.out.println("You are taking loan from"+bank.getBankName());

        AbstructFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount,years);

    }
}

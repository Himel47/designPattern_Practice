package Abstruct_Factory_Pattern;

import Abstruct_Factory_Pattern.bank.Bank;
import Abstruct_Factory_Pattern.loan.*;

public class LoanFactory extends AbstructFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan==null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        }
        else if(loan.equalsIgnoreCase("Educational")){
            return new EducationalLoan();
        }
        return null;
    }
}

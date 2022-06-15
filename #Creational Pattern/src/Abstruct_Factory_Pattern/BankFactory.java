package Abstruct_Factory_Pattern;

import Abstruct_Factory_Pattern.bank.*;
import Abstruct_Factory_Pattern.loan.*;

public class BankFactory extends AbstructFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank==null){
            return null;
        }
        if(bank.equalsIgnoreCase("IFIC")){
            return new IFIC();
        }
        else if(bank.equalsIgnoreCase("DutchBangla")){
            return new DutchBangla();
        }
        else if(bank.equalsIgnoreCase("BRAC")){
            return new BRAC();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}

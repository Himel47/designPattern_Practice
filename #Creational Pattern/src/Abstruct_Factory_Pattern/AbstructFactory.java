package Abstruct_Factory_Pattern;

import Abstruct_Factory_Pattern.bank.*;
import Abstruct_Factory_Pattern.loan.*;

abstract class AbstructFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

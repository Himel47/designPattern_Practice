package Abstruct_Factory_Pattern.loan;

public class BusinessLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }

}

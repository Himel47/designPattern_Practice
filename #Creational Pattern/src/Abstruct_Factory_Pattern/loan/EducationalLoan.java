package Abstruct_Factory_Pattern.loan;

public class EducationalLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}

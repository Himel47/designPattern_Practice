package Abstruct_Factory_Pattern.loan;


public abstract class Loan {
    protected double rate;
    public abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years){
        double Kisti;
        int time;

        time = years*12;
        rate=rate/1200;
        Kisti = ((rate*Math.pow((1+rate),time))/((Math.pow((1+rate),time))-1))*loanAmount;

        System.out.println("Your Monthly Kisti is "+Kisti+" for the amount "+loanAmount+" you have borrowed");

    }

}

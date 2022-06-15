package Abstruct_Factory_Pattern.bank;

public class BRAC implements Bank{
    private final String BankName;
    public BRAC(){
        BankName = "BRAC Bank";
    }
    @Override
    public String getBankName() {
        return BankName;
    }
}

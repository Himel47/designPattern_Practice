package Abstruct_Factory_Pattern.bank;

public class IFIC implements Bank{
    private final String BankName;
    public IFIC(){
        BankName = "IFIC Bank";
    }
    @Override
    public String getBankName() {
        return BankName;
    }
}

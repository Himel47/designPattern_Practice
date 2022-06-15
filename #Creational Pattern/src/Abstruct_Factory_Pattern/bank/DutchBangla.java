package Abstruct_Factory_Pattern.bank;

public class DutchBangla implements Bank{
    private final String BankName;
    public DutchBangla(){
        BankName = "Dutch Bangla Bank";
    }
    @Override
    public String getBankName() {
        return BankName;
    }
}

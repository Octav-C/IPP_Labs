package AdapterPattern;

public class Bank {
    private String bankName;
    private String takeCredit;
    public Bank(String bankName, String takeCredit) {
        this.bankName = bankName;
        this.takeCredit = takeCredit;
    }

    public String getBank() {
        return bankName;
    }

    public String getCredit() {
        return takeCredit;
    }
}

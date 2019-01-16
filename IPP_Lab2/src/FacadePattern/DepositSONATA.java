package FacadePattern;

public class DepositSONATA implements Deposits{
    private int enteredAmount;
    private String name;
    private int percent;

    public DepositSONATA(int enteredAmount, String name) {
        this.enteredAmount = enteredAmount;
        this.name = name;
        this.percent = 4000;
    }

    @Override
    public int calculatePercent() {
        return percent / 100 * enteredAmount;
    }

    public String getName() {
        return name;
    }

    public int getEnteredAmount() {
        return enteredAmount;
    }

    @Override
    public String aboutDeposit() {
        return "Deposit " + getName() +
                " offers " + calculatePercent() + " of " + getEnteredAmount();
    }
}

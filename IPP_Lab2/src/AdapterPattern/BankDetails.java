package AdapterPattern;

import java.util.Random;

public class BankDetails extends Bank implements ICredit {
    private int subsidiary;
    private int salary;
    private final String SPACE = ", ";

    public BankDetails(String bankName, String takeCredit, int salary, int subsidiary) {
        super(bankName, takeCredit);
        this.subsidiary = subsidiary;
        this.salary = salary;
    }

    public int getSubsidiary() {
        return subsidiary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int calculateCredit() {
        int creditSum = 0;

        if(salary > 500 && salary < 1000) {
            creditSum += randomNumber(1000, 500);
        }
        else if(salary > 1000 && salary < 2000) {
            creditSum += randomNumber(2000, 1000);
        }
        else if (salary < 500) {
            creditSum = 0;
        }

        return creditSum;
    }
    int randomNumber(int max, int min) {
        int random_number = new Random().nextInt(max - min) + min;

        return random_number;
    }

    @Override
    public String receiveCredit() {
        return getBank() + SPACE + getCredit() + SPACE + getSubsidiary() + SPACE + getSalary() + SPACE + calculateCredit();
    }
}

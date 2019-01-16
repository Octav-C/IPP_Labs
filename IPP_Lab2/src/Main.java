
import AdapterPattern.BankDetails;
import AdapterPattern.ICredit;
import BridgePattern.ConvertEUR;
import BridgePattern.ConvertUSD;
import BridgePattern.Converter;
import BridgePattern.Currency;
import DecoratorPattern.BankName;
import DecoratorPattern.Credits;
import DecoratorPattern.Deposits;
import DecoratorPattern.IBank;
import FacadePattern.BankDeposits;
import FlyweightPattern.EmployeeInfo;
import FlyweightPattern.Flyweight;
import FlyweightPattern.FlyweightFactory;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("--- Adapter Pattern ---");
        ICredit credit = new BankDetails("Moldova-Agroindbank", "Student", 800, 25);
        out.println(credit.receiveCredit());
        out.print("\n");

        out.println("--- Bridge Pattern ---");
        Currency usd = new Converter(14, new ConvertUSD());
        Currency eur = new Converter(21, new ConvertEUR());
        usd.show();
        eur.show();
        out.print("\n");

        out.println("--- Facade Pattern ---");
        BankDeposits depositsBank = new BankDeposits();
        out.println(depositsBank.aboutJazz());
        out.println(depositsBank.aboutSonata());
        out.println(depositsBank.aboutTango());
        out.print("\n");

        out.println("--- Decorator Pattern ---");
        IBank _bank = new Credits(new Deposits(new BankName()));
        out.println(_bank.BankInformation());
        out.print("\n");

        out.println("--- Flyweight Pattern ---");
        for(int i = 0; i < 10; ++i) {
            Flyweight employee = (Flyweight) FlyweightFactory.getEmployee(EmployeeInfo.getRandomName());
            employee.setAge(EmployeeInfo.getRandomAge());
            employee.aboutEmployee();
        }
    }
}

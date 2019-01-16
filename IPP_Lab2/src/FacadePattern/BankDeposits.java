package FacadePattern;

import static java.lang.System.out;

public class BankDeposits {

    private Deposits sonata = new DepositSONATA(14, "SONATA");
    private Deposits tango = new DepositTANGO(9, "TANGO");
    private Deposits jazz = new DepositJAZZ(3, "JAZZ");

    public String aboutJazz() {
        return jazz.aboutDeposit();
    }

    public String aboutSonata() {
        return sonata.aboutDeposit();
    }

    public String aboutTango() {
        return tango.aboutDeposit();
    }
}
